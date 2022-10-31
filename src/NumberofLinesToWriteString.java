public class NumberofLinesToWriteString {

    public static int[] numberOfLines(int[] widths, String s) {

        int Sum=0;
        int line=0;
        for (int i=0; i< s.length();i++) {
            if (Sum + widths[i]<=100)
            {
                Sum=Sum+widths[i];
            }
            else
            {
                Sum=widths[i];
                line++;
            }
        }
        int[] result= new int[2];
        result[0]=line+1;
        result[1]=Sum;

        return result;

    }
    public static void main(String[] args) {

        int[] widths={10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] result= numberOfLines(widths,s) ;

        System.out.println(result[0] +"  "+result[1]);

    }
}
