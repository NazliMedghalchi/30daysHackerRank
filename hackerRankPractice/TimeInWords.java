import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeInWords {

    public static final String[] numbers = {" ", "one", "two", "three",
                                                "four", "five", "six",
                                                "seven", "eight", "nine",
                                                "ten", "eleven", "twelve",
                                                "thirteen", "fourteen", "fifteen",
                                                "sixteen", "seventeen", "eighteen",
                                                "ninteen"
                                            };

    public static final String[] tens = {" ", " ", "twenty", "thirty","forty",
                                                    "fifty", "sixty"
                                        };

    public static String convertMin(int m){
        String minS = new String();

        if (m <= 19){
            minS = numbers[m];
        }

        else if (m > 19 && m < 60){
            int tensM = m/10;
            int onesM = m%10;
            minS = tens[tensM] + numbers[onesM];
        }
        return minS;

    }

    public static String convertHour(int h){
        String hourS = new String();
        hourS = numbers[h];
        return hourS;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
        String minS = new String();
        String hourS = new String();
        String s = new String();

        if (m == 15){
            s = " quarter past ";
            hourS = convertHour(h);
            System.out.println( s + hourS);
        }

        else if (m == 45){
            s = " quarter to ";
            hourS = convertHour(h);
            System.out.println( s + hourS);
        }
        else if (m < 30 && m > 1){
            s = " minutes past ";
            minS = convertMin(m);
            hourS = convertHour(h);
            System.out.println( minS + s + hourS);
        }

        else if (m == 1) {
            s = " minute past ";
            minS = convertMin(m);
            hourS = convertHour(h);
            System.out.println(minS + s + hourS);
        }

        else if (m == 30){
            s = " half past ";
            hourS = convertHour(h);
            System.out.println(s + hourS);
        }

        else if (m > 30 && m < 40 ){
            s = " minutes past ";
            minS = convertMin(m);
            hourS = convertHour(h);
            System.out.println(minS + s + hourS);
        }
        else if ((m >= 40 && m < 45) || (m > 45 && m < 60)){
            s = " minutes to ";
            minS = convertMin(60-m);
            hourS = convertHour(h+1);
            System.out.println(minS + s + hourS);
        }

        else if (m == 0) {
            s = " o' clock ";
            hourS = convertHour(h);
            System.out.println(hourS + s );
        }
    }
}

