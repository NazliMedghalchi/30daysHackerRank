/**
 * Created by Nazli on 2016-07-12.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class EvenOddStrings {
    private static ArrayList<String> input = new ArrayList<String>();
    private static int num = 0;

    public static void splitString(String str){
        char[] inputChar = str.toCharArray();
        char[] even = new char[inputChar.length];
        char[] odd = new char[inputChar.length];
        ArrayList<String> returnString = new ArrayList<String>();

        for (int i = 0; i < inputChar.length; i += 2){
            System.out.print(inputChar[i]);
        }

        System.out.print(" ");

        for (int i = 1; i < inputChar.length; i+= 2){
            System.out.print(inputChar[i]);
        }
        System.out.print("\n");


   /* int n = 0; // for even string
    int m = 0; // for odd string

    for (int i = 0; i < inputChar.length; i++){
        if (i%2 == 0){
           even[n] = inputChar[i];
           n++;
        }

       else if (i%2 != 0){
           odd[m] = inputChar[i];
           m++;
        }
    }

    String evenStr = Arrays.toString(even);
    String oddStr =  Arrays.toString(odd);
    returnString.add(0, evenStr);
    returnString.add(1, oddStr);
    System.out.println(returnString.get(0) + "  " + returnString.get(1));
    return returnString;

    */
    }

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        int count = 0;
        ArrayList<String> oddEvenString = new ArrayList<>();
        scan.nextLine();
        while (count < num){
            input.add(count, scan.nextLine()); // scan.nextLine();
            splitString(input.get(count));
            count++;
        }
        for (String s : input){

        }


    }
}

