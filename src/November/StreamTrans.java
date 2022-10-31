package November;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTrans {

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");


        List<Transaction> transations = Arrays.asList( new Transaction(brian, 2011,300),
                                            new Transaction(raoul, 2012,1000),
                                            new Transaction(raoul, 2011,400),
                                            new Transaction(mario, 2012,710),
                                            new Transaction(mario, 2012,700),
                                            new Transaction(alan, 2012,950) );

        //Find all transaction of 2012 in sorted by value

        List<Transaction> result = transations.stream()
                                                .filter(y->y.getYear()==2012)
                                                .sorted(Comparator.comparing(Transaction::getValue))
                                                .collect(Collectors.toList());

        //System.out.println(result.toString());

        //
        // All Unique cities where Traders works
        List<String> cities = transations.stream()
                .map(transaction -> transaction.getTrader().getCity()).distinct().collect(Collectors.toList()) ;

       // System.out.println(cities.toString());

        List<Trader> traders = transations.stream().filter(trans-> trans.getTrader().getCity() == "Cambridge")
                .map(Transaction::getTrader).sorted(Comparator.comparing(Trader::getName)).distinct()
                .collect(Collectors.toList());

        //System.out.println(traders.toString());

        // *** String of all traders names sorted
        String strtrader= transations.stream().map(t -> t.getTrader().getName())
                .sorted()
                .distinct()
                .reduce(" ", (s1,s2) -> s1 + s2);

        //System.out.println(strtrader.toString());

        // *** Any traders based in Milan

        List<Trader> tra= transations.stream().map(Transaction::getTrader).
                filter(s -> s.getCity() == "Milan").distinct().collect(Collectors.toList());
        //System.out.println(tra);

        List<Integer> val =transations.stream().filter(s->s.getTrader().getCity() == "Cambridge").distinct()
                .map(Transaction::getValue).collect(Collectors.toList());
      //  System.out.println(val);


        //Highest Value of transaction
        Optional<Transaction> resultrans= Optional.of(transations.stream().collect(Collectors.maxBy(Comparator.comparingInt(Transaction::getValue))).get());

        Optional<Integer> highVal= transations.stream().map(Transaction::getValue).reduce(Integer::max);

        OptionalInt highValue= transations.stream().mapToInt(Transaction::getValue).max();
        //System.out.println(highValue);

       Map<String, List<Transaction>> transMap =transations.stream().collect(Collectors.groupingBy(t->t.getTrader().getName()));
        System.out.println(transMap);



    }


}
