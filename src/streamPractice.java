import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class streamPractice {

    static  class Mapper
    {
        public static Function<String, String> selectDistictChar()
        { return new Function<String, String>() {
            @Override
            public String apply(String s) {
                System.out.println("In selectDistictChar:" + s);
                //System.out::println(Arrays.stream(s.split("")).distinct().collect((Collectors.joining("")));

                return Arrays.stream(s.split("")).distinct().collect((Collectors.joining("")));
            }
        };

        }
    }
    static class Filtter {
        public static Predicate<String> selectonPrefix(String prefix) {
            return new Predicate<String>() {
                @Override
                public boolean test(String t) {
                    // System.out.println(t);
                    return t.startsWith(prefix);
                }
            };
        }
    }

    public static void main(String[] args) {

        List<String> lst = new ArrayList<String>();
        lst.add("aaraysaan");
        lst.add("aaraan");
        lst.add("baadan");
        lst.add("dadan");
        lst.add("yaadan");
        lst.add("raadan");

        String Prefix = "aa";
        lst.stream().filter(Filtter.selectonPrefix(Prefix))
                .map(Mapper.selectDistictChar()).forEach(System.out::println);

    }


}
