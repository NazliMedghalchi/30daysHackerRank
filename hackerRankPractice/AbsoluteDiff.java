/**
 * Created by Nazli on 2016-07-13.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Difference {
        private int[] elements;
        public int maximumDifference;
        // Add your code here

        Difference (int[] elements){
            this.elements = new int[elements.length];
            for (int i =0; i<elements.length; i++){
                this.elements[i] = elements[i];
            }
        }

        public void computeDifference (){
            int max = 0;
            for (int i = 0; i<this.elements.length-1; i++){
                for(int j=1; j<this.elements.length; j++){
                    int sub = (Math.abs(this.elements[j]-this.elements[i]));
                    if (sub > max){
                        max = sub;
                        this.maximumDifference = max;
                    }

                }
            }
        }

} // End of Difference class

public class AbsoluteDiff {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
