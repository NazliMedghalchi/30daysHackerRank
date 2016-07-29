import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pairs {
    static int pairs(int[] a,int k) {
      /* Complete this function */
        int res =0;
        for (int i=0; i<a.length; i++){
            for (int j=a.length-1; j-i>0; j--){
                if (Math.abs(a[i]-a[j]) == k)
                    res++;
            }
        }
        // sort the array - increasing
        /*for (int i=0; i<a.length; i++) {
            if (a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }

        Hashtable<Integer, Integer> pairHash = new Hashtable<Integer, Integer>();
        // find minimum value for a pair
        for (int i=0; i<a.length; i++){
            pairHash.put(a[i], a[i]+k);
        }
        for (int i=0; i<a.length; i++){
            if (Math.abs(a[i]-pairHash.entrySet() == k)
                res++;
        }

        int i=0;
        int j=1;
        while (i<a.length && j<a.length){
            int diff = Math.abs(a[j]-a[i]);
            if (diff == k){
                res++;
                j++;
            }
            if (diff > k)
                i++;
            if (diff < k)
                j++;
            i++;

        }*/
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;

        String n = in.nextLine();
        String[] n_split = n.split(" ");

        int _a_size = Integer.parseInt(n_split[0]);
        int _k = Integer.parseInt(n_split[1]);

        int[] _a = new int[_a_size];
        int _a_item;
        String next = in.nextLine();
        String[] next_split = next.split(" ");
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a_item = Integer.parseInt(next_split[_a_i]);
            _a[_a_i] = _a_item;
        }


        res = pairs(_a,_k);
        System.out.println(res);
    }
}

