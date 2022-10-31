public class DeleteColSorted {
    public static int minDeletionSize(String[] strs) {

        int count=0;
        for(int col=0;col< strs[0].length(); col++)
            for(int j=0; j<strs.length-1; j++)
                if (strs[j].charAt(col)>strs[j+1].charAt(col)) {
                    count++;
                    break;
                }
        return count;
    }
    public static void main(String[] args) {
     String[] strs =  {"zyx","wvu","tsr"};
        int count= minDeletionSize(strs);
        System.out.println("Count:" + count);
    }
}
