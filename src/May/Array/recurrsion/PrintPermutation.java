package May.Array.recurrsion;

public class PrintPermutation {

    public static void printper(String input, String ans)
    {
        if (input.length()==0)
            System.out.println(ans);
        for(int i =0; i<input.length(); i++)
        {
            char ch= input.charAt(i);
            String ros=input.substring(0,i) + input.substring(i+1);
            printper(ros,  ans + ch);
        }
    }
    public static void main(String[] args) {
        printper("abc","");
    }
}
