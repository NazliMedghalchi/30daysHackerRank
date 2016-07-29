import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringAndArray {

    public static ArrayList<String> splitString(String str){
        ArrayList<String> strArray = new ArrayList<String>();
        char[] temp = str.toCharArray();
        char[] even = new char[temp.length];
        char[] odd = new char[temp.length];
        String strEven = "";
        String strOdd = "";
        int countEven = 0;
        int countOdd = 0;
        for (int i=0; i< temp.length; i++){
            if (i%2 == 0){
                even[countEven] = temp[i];
                countEven++;
            }
            else{
                odd[countOdd] = temp[i];
                countOdd++;
            }

        }
        strEven = String.valueOf(even);
        strOdd = String.valueOf(odd);
        strArray.add(0, strEven);
        strArray.add(1, strOdd);
        return (strArray);
    }

    public static void print2String(ArrayList <String> str){
        System.out.println(str.get(0) + "  " + str.get(1));
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int testNum = scan.nextInt();
        String[] inputStr = new String[testNum];
        scan.nextLine();
        ArrayList<String> strArray = new ArrayList<String>();
        for (int i=0; i<testNum; i++){
            inputStr[i] = scan.nextLine();
        }
        for (int j=0; j<inputStr.length; j++){
            strArray = splitString(inputStr[j]);
            // System.out.println(strArray.get(0) + strArray.get(1));
            print2String(strArray);
        }
    }
}