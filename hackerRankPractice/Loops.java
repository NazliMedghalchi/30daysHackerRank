import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (N < 2 || N > 20)
            System.out.println("Not followed constrains");
        else {
            for (int i=1; i<=10; i++){
                System.out.println(N + " x " + i + " = " + N*i);
            }
        }
    }
}