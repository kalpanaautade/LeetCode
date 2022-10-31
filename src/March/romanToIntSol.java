package March;

public class romanToIntSol {

    public static void main(String[] args) {

     int  result =  romanToInt("MCMXCIV");

     System.out.println("Result="+ result);

    }

    private static int getValue(char ch)
    {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    public static int romanToInt(String s) {
        int sum=0;
        int  current=0, prev=0;
        for (int i=0; i<s.length();i++)
        {
            current=getValue(s.charAt(i));
            if (prev >= current || prev==0)
            {
               sum=sum+current;
                prev=current;
            }
            else
            {
                sum=sum - prev -prev +current;
                prev=current;
            }
        }
        return  sum;
    }
}
