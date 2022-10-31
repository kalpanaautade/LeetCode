package May.Array;

public class ArrayProduct {

    static int[] arrayOfArrayProducts(int[] arr) {
        // your code goes here
        // [2, 7, 3, 4]
        int[] res= new int[arr.length];
        for(int i=0;i<arr.length; i++ )
        {
            if( i!= arr.length-1)
                res[i+1]=arr[i+1]*arr[i];
            else
                res[0]=arr[i]*arr[0];
        }



        for(int i=arr.length-1;i>=0; i-- )
        {
            if( i!= arr.length-1)
                arr[i+1]=res[i];
            else
                arr[0]=res[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 3, 4};

        int[] result= arrayOfArrayProducts( arr);

        for(int i=0;i<arr.length; i++ )
            System.out.println(result[i] + ", ");
        //  output: [84, 24, 56, 42]
    }
}
