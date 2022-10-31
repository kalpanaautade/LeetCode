package May.Array.recurrsion;

public class PrintMazePath {

    public  static void printMazePath(int sr, int sc, int dr, int dc, String path)
    {
        if(sr==dr && sc==dc)
        {
            System.out.println(path);
            return;
        }
        if(sc <= dc)
            printMazePath(sr, sc+1, dr, dc, path + "-h");
        else
            return;

        if (sr<=dr)
            printMazePath(sr+1, sc, dr, dc, path + "-v");
        else
            return;
    }

    public static void main(String[] args) {

        printMazePath(0,0, 3,3 , "");
    }
}
