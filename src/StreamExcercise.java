import java.sql.Array;
import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExcercise {

    public static void firstElement()
    {
        Stream<String> strm = Stream.of("Geek","for","Geek");
       System.out.println( strm.findFirst());
    }
    public static void lastElement()
    {
        Stream<String> strm = Stream.of("Geek","for","Geeks");
        System.out.println( strm);
    }
    public static void findDuplicate()
    {
      //  Stream<String> strm = Stream.of("Geek","for","Geeks").;
        //System.out.println( strm);
    }
    public static void main(String[] args) {
        firstElement();
    }
}
