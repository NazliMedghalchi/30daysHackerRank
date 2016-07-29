/**
 * Created by Nazli on 2016-07-27.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class MadProf {
    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numTest = scan.nextInt();
        for (int i=0; i<numTest; i++){
            scan.nextLine();
            int s = scan.nextInt();
            int min = scan.nextInt();
            int[] delay = new int[s];
            int sum = 0;
            for (int j=0; j<s; j++){

                delay[j] = scan.nextInt();
                if (delay[j] > 0)
                    sum ++;
            }
            if (s-sum >= min)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }

}
