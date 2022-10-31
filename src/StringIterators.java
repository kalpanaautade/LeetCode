public class StringIterators {

    char currentChar;
    int currentDigit=0;
    int index=0;
    String compressedStrings;
    public StringIterators(String compressedString) {
        compressedStrings=compressedString;
    }

    public char next() {
        if(currentDigit==0)
        {
            if(index>0)
            index++;
            char ch=compressedStrings.charAt(index);
            index++;
            char digit=compressedStrings.charAt(index);
            int dig=Integer.parseInt(String.valueOf(digit));
            currentDigit=dig-1;
            index++;
            currentChar=ch;
            return currentChar;
        }
        else
        {
            currentDigit=currentDigit-1;
            return currentChar;
        }

    }

    public boolean hasNext() {

        if(index< compressedStrings.length())
            return  true;
        else
            return false;
    }
}
