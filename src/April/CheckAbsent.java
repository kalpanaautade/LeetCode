package April;

import java.util.ArrayList;
import java.util.List;

public class CheckAbsent {

    public static void main(String[] args) {
        boolean flag= checkRecord("PRALLL");
        System.out.println(flag);
    }

        public static boolean checkRecord(String s) {

            char[] records =s.toCharArray();

            int absent =0;
            List<Integer> Lpos= new ArrayList<Integer>();
            int i=0;
            for (char ch:records )
            {
                if(ch=='A')
                    absent ++;
                if(ch=='L')
                    Lpos.add(i);
                i++;
            }
            int consecutive=1;
            if(absent <2)
            {
                for(int j=0; j<Lpos.size()-1; j++ )
                {
                    if(Lpos.get(j+1)-Lpos.get(j)==1)
                    {
                        consecutive++;
                        if (consecutive==3)
                            break;

                    }
                    else if( consecutive<=2)
                        consecutive=1;

                }
                if (consecutive==3)
                    return false;
                else
                    return true;
            }
                return false;

        }

}
