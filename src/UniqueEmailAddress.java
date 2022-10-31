import java.util.ArrayList;
import java.util.List;

public class UniqueEmailAddress {

    public static int numUniqueEmails(String[] emails) {
        List<String> newEmails = new ArrayList<String>();
        for (int i=0; i<emails.length; i++)
        {
            String firststr=emails[i].substring(0, emails[i].indexOf("@"));
            String secondstr=emails[i].substring(emails[i].indexOf("@"), emails[i].length());

            firststr=firststr.replace(".","");
             if (firststr.contains("+"))
             {
                 firststr=firststr.substring(0, firststr.indexOf("+"));
             }
             String  emailid= firststr + "@" + secondstr;

             if (!newEmails.contains(emailid))
                 newEmails.add(emailid);
        }
        return newEmails.size();
    }

    public static void main(String[] args) {

       // String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        int Result=  numUniqueEmails(emails);

        System.out.println("Result=" + Result);
    }
}
