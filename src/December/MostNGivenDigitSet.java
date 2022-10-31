package December;

public class MostNGivenDigitSet {

    public  static int atMostNGivenDigitSet(String[] digits, int n) {
int len =1;
int count=0;
String str="";
while (len <= String.valueOf(n).length())
{
    for (int i=0; i< digits.length ; i++) {
        str = digits[i];
        String substr=str;
        for (int j=0;j< digits.length && substr.length()< len ; j++)
            substr = substr + digits[j];
            if (Integer.parseInt(substr) <= n) {
                count++;
                System.out.println(substr + ", ");
                substr = str;
            }

}
    len++;
}
return count;

}
    public static void main(String[] args) {
        String[]  digits = {"1","3","5","7"};
        int n = 100;
      int count=  atMostNGivenDigitSet(digits,n);
        System.out.print(" Count =" + count);

    }
}