package Walmart;

import java.util.ArrayList;
import java.util.List;

public class DigitOrderSol {

    public  static int ascOrderNumber(int n)
    {

        int newnumber= n-1;
        while (newnumber>0) {
            List<Integer> lst = new ArrayList<Integer>();
            int tmp =newnumber;
            while (newnumber > 0) {
                int reminder = newnumber % 10;
                lst.add(reminder);
                newnumber = newnumber / 10;
            }
            newnumber=tmp;
            boolean flag=false;
            for (int i = 0; i < lst.size() - 1; i++) {
                if (lst.get(i) < lst.get(i + 1)) {
                    flag=true;
                    newnumber = newnumber - 1;
                    break;
                }
            }
            if (flag==false)
                return newnumber;


        }
        return 0;



    }

    static int placeValue(int N, int num)
    {
        int total = 1, value = 0, rem = 0;
        while (true) {
            rem = N % 10;
            N = N / 10;

            if (rem == num) {
                value = total * rem;
                break;
            }

            total = total * 10;
        }
        return value;
    }

    public static void main(String[] args) {

        int Result=ascOrderNumber(98765432);
        System.out.println("result:"+ Result);
    }
}
