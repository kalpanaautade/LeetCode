package July.Recursion;

public class Fibbinacci {

   static int[]   arr = new int[5];
   static int count=0;
   public static int fibbo(int n)
    {
        if(n==0 || n==1)
        {
            arr[0]=1;
            arr[1]=1;
            return 1;
        }

       int r= fibbo(n-1)+fibbo( n-2);
        arr[count++]=r;
        return r;
    }
    public static void main(String[] args) {
        int res= fibbo(5);
        for (int i=0; i <5; i++)
        System.out.println(arr[i]);
    }
}
