package November;

public class Transaction {

    private final Trader trader;

    public Trader getTrader() {
        return trader;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", year=" + year +
                ", value=" + value +
                '}';
    }

    public int getYear() {
        return year;
    }

    public int getValue() {
        return value;
    }

    private final int year;
    private final int value;

    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }
}
