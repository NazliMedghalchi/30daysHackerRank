/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


//ref: http://tuxbyte.blogspot.ca/2016/02/java-program-for-2d-array-hourglass-sum.html
public class Arrays2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int maxSum = 0;

        //int hourGlass[][] = new int[3][3];
        int sum = 0;
        int cnt = 0;

        // hourglass width
        for (int n = 0; n<arr.length; n++){
            for (int m = 0; m<arr[0].length; m++){
                if (n+2 < arr.length && m+2 < arr[0].length)
                    sum = arr[n][m] + arr[n][m+1] + arr[n][m+2] +
                            arr[n+1][m+1]+
                            arr[n+2][m] + arr[n+2][m+1] + arr[n+2][m+2];
                if (sum > maxSum)
                    maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arrays2D {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        int cnt = 0;
        int[] sum = new int[16];
        int maxSum;
        for (int i =0 ; i+2 < arr.length; i++){
            for (int j=0; j+2 < arr[0].length; j++){
                sum[cnt++] = arr[i][j] + arr[i][j+1] + arr[i][j+2] +
                        arr[i+1][j+1] +
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];


            }
        }
        maxSum = sum[0];
        for (int n : sum)
            if (n > maxSum )
                maxSum = n;
        System.out.println(maxSum);
    }
}

