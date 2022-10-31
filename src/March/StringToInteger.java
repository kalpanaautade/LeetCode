package March;

public class StringToInteger {


    public static void main(String[] args) {

       int result= myAtoi("   -4567");

       System.out.println("Result= "+ result);
    }

    public static int myAtoi(String s) {

        s=s.trim();
        int sign =1;
        int currentResult=0;
        int currentDigit=0;
        try {
            for (int i = 0; i < s.length(); i++) {
                if (i == 0 && s.charAt(i) == '-')
                    sign = -1;
                else if (i == 0 && s.charAt(i) == '+')
                    sign = 1;
                else
                    currentDigit = Integer.parseInt(String.valueOf(s.charAt(i)));

                currentResult = currentResult * 10 + currentDigit;
            }
        }
        catch (NumberFormatException ex)
        {
            System.out.println(ex);
        }
        return currentResult*sign;
    }
}
