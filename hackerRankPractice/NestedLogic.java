/**
 * Created by Nazli on 2016-07-26.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NestedLogic {
    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int[] current = new int[3];
        int[] expected = new int[3];
        for(int i=0; i<3; i++)
            current[i] = scan.nextInt();
        scan.nextLine();
        for(int j=0; j<3; j++)
            expected[j] = scan.nextInt();
        if (current[2] > expected[2])
            System.out.println("10000");
        else if (current[2] == expected[2]){
            if (current[1] > expected[1])
                System.out.println(500*(current[1]-expected[1]));

            else {
                if (current[0] >  expected[0])
                    System.out.println(15*(current[0]-expected[0]));
                else
                    System.out.println("0");
            }
        }
        else if (current[2] < expected[2])
            System.out.println("0");


    }

}
