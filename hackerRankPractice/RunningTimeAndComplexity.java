import java.util.Scanner;

/**
 * Created by Nazli on 2016-07-20.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class RunningTimeAndComplexity {

    public static void main(String[] args) {
    /* Enter your code here. */
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i=0; i < size; i++){
            num[i] = scan.nextInt();
        }
        for (int n : num){
            boolean flag = false; //prime number

            int i = 2;
            if (n == 1){
                flag = true;
            }
            while (i*i < n){
                if (n%i == 0)
                    flag = true; // not prime number
                i++;
            }

            if (flag == false || n == 2 )
                System.out.println("Prime");
            else if (flag)
                System.out.println("Not prime");

        }
    }
}

