package July.Recursion;

public class GenerateParentesis {

    public static void generatePars(int opencnt, int closecnt, String result)
    {
        if (opencnt==0 && closecnt==0)
        {
            System.out.println(result);
            return;
        }

        if(opencnt==closecnt)
            generatePars( opencnt-1,  closecnt, result+"(");
        if(opencnt>0)
            generatePars( opencnt-1,  closecnt, result+"(");
        if(closecnt>0)
            generatePars( opencnt,  closecnt-1, result+")");

    }

    public static void main(String[] args) {
        generatePars(0,0, "");
    }
}
