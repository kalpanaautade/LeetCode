package May.Array.recurrsion;

public class AbbrivationSol {

    public static void abbrivation(String  str , int idx,  String ans)
    {
        if ( idx >=  str.length())
        {
            System.out.println(ans);
            return;
        }
        abbrivation(  str ,  idx+1, ans + str.charAt(idx));
        abbrivation(  str , idx+1,   ans + "1");

    }

    public static void main(String[] args) {
        abbrivation("pep" , 0,  "");
    }
}
