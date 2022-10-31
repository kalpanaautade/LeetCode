package April.Mock;

public class IndexOfShiftedArray {
    public static void main(String[] args) {
        int[] shiftArr={9,10,11,2,4,6};
        int num=10;

      int Result=  shiftedArrSearch(shiftArr, num);

    }

        static int shiftedArrSearch(int[] shiftArr, int num) {

            int i=1;

            while(shiftArr[i-1] <shiftArr[i])
            {
                i++;

            }
            int left=0;
            int right = 0;

            if(num<= shiftArr[i])
            {
                left= i;
                right = shiftArr.length;

            }
            else
            {
                left= 0;
                right = i-1;

            }
            int mid=0;
            while(left<=right && shiftArr[mid] !=num)
            {
                mid= (left +right)/2;

                if( shiftArr[mid] ==num)
                    return mid;
                else if(  shiftArr[mid]  < num )
                    left=mid+1;
                else if (  shiftArr[mid]  > num )
                    right=mid-1;
            }
            return mid;

        }



}
