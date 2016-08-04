/**
 * Created by Nazli on 2016-08-04.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class RegExPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Pattern pName = Pattern.compile("[20a-zA-Z]");
        Pattern pUser = Pattern.compile("[50a-z]@gmail.com");
        Matcher mName;
        Matcher mUser;
        List<String> listName = new ArrayList<String>();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            mName = pName.matcher(firstName);
            mUser = pUser.matcher(emailID);
            if (mUser.find())
                listName.add(firstName);
        }
        Collections.sort(listName);
        for (String s : listName)
            System.out.println(s);

    }



}
