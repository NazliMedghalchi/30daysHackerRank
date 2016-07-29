import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindOnes {

    public static boolean checkOne(int n){
        if (n == '1')
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int maxLenght =0;

        String binaryN = Integer.toBinaryString(n);
        char[] charBinaryN = binaryN.toCharArray();
        //HashMap <Integer, Integer> findOnes = new HashMap<Integer, Integer>();

        int d = 0;
        int i = 0;
        while(i<charBinaryN.length){
            if (checkOne(charBinaryN[i]) == true ) {
                d++;
                i++;
                if (maxLenght <= d )
                    maxLenght = d;
            }
            else {
                i++;
                d = 0;
            }

        }

        System.out.println(maxLenght);
    }
}


