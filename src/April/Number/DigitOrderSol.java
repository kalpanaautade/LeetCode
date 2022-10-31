package April.Number;

import java.util.ArrayList;
import java.util.List;

public class DigitOrderSol {
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

    public  static int ascOrderNumber(int n) {

        int newNumber=n;

        int dummyN=n;
        List<Integer> numberlst= new ArrayList<Integer>();
        while(dummyN>0)
        {
            numberlst.add(dummyN%10);
            dummyN=dummyN/10;
        }
        int pos=numberlst.size()-1;
        while(pos>0)
        {
            if(numberlst.get(pos)>numberlst.get(pos-1))
            {
                int diff=numberlst.get(pos)-numberlst.get(pos-1);

                int val = placeValue(n,numberlst.get(pos) );

                newNumber=newNumber-(val * diff);

            }

        }
        return newNumber;

    }
    public static void main(String[] args) {

    }
}
