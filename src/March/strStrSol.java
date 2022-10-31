package March;

public class strStrSol {

    public static int strStr(String haystack, String needle) {

        int nLen = needle.length();

        if(nLen == 0){
            return 0;
        }

        int hLen = haystack.length();

        if(hLen == 0 || hLen < nLen) {
            return -1;
        }
        for(int i=0; i<haystack.length() ; i++) {
            if(haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {


        int index= strStr("mississippi","issip");

        System.out.println("Index:"+index);

    }
}
