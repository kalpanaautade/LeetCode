package July.Recursion;

public class NumberToWordSol {

    public static void numberToWords(int num) {

        NumberTraval( num , 0, 0);
    }

    public static void NumberTraval(int num , int placevalue, int division)    {

        if (num==0)
            return ;
         placevalue= (int) Math.pow(10,String.valueOf(num).length()-1);
         division= (int) (num/placevalue);
        num=(int) (num%placevalue);


        NumberTraval(num ,placevalue, division );
        System.out.println("Num:"+num);
        System.out.println("placevalue:"+placevalue);
        System.out.println("division:"+division);
        System.out.println("             ");

    }

  public static void  FormatString( int placeValue, int division)
  {
      String[] onePlace={"One", "Two", "Three", "Four", "Five"};
      String[] twoPlace={"Ten", "Eleven","Twelve", "Thrteen", "Fourteen", "FiveTeen", "Sixteen"};
      if (placeValue==1)
      {

      }
  }

    public static void main(String[] args) {
        numberToWords(234);
    }
}
