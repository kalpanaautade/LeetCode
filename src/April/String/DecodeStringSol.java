package April.String;

import java.util.Stack;

public class DecodeStringSol {
    public static String decodeString(String s) {

        Stack<String> stack= new Stack<String>();

        String decodestr="";
        String tmpstr="";
        String top;
      /*  for(int i=0; i<s.length(); i++) {
            int counter = 0;
           if (s.charAt(i) != ']' && s.charAt(i) != '[') {
                stack.push(String.valueOf(s.charAt(i)));
            } else if (s.charAt(i) == ']') {
                top = stack.pop();

                while (!((int) top >= 49 && (int) top <= 57)) {
                    tmpstr = top + tmpstr;
                    top = stack.pop();
                }
                if ((int) top >= 49 && (int) top <= 57) {
                    counter = Integer.parseInt(String.valueOf(top));
                    while (counter > 0) {
                        decodestr += tmpstr;
                        counter--;
                    }
                    tmpstr = "";
                }
            }
        }*/
        return decodestr;

    }

    public static void main(String[] args) {
    String Result=    decodeString( "3[a2[c]]");

    System.out.println("Result:"+Result);
    }
}
