
    //from  w w w  . j a v  a 2  s . co  m
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

    public class StreamPractice2 {
        public static void main(String[] args) {

            List<String> names = Arrays.asList("CSS", "CSS3", "HTML", "Java",
                    "Javascript", "Oracle", "MySQL");

            String name5 = names.stream().map(StreamPractice2::toUpperCase)
                    .filter(StreamPractice2::greaterThanFive).limit(2)
                    .collect(Collectors.joining(" + ")).toString()
                    + " = WSM!!!";

            System.out.println(name5);
        }

        private static String toUpperCase(String s) {
            System.out.println("toUpperCase: " + s);
            return s.toUpperCase();
        }

        private static boolean greaterThanFive(String s) {
            System.out.println("greaterThanFive: " + s);
            return s.length() > 5;
        }
    }

