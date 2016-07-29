/**
 * Created by Nazli on 2016-07-13.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exceptions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try {
            int n = Integer.parseInt(S);
            System.out.println(n);
        }catch (NumberFormatException  e){
            System.out.print("Bad String");

        }


    }

}
