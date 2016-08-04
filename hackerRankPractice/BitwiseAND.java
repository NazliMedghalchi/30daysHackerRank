/**
 * Created by Nazli on 2016-08-04.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitwiseAND {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int[] num = new int[n];
            for (int i = 0 ; i < n ; i++){
                num[i] = i+1;
            }
            int ans = 0;
            int ad = 0;
            for (int m = 0; m<n; m++){
                for(int j=m+1; j<n; j++){
                    ad = num[m] & num[j];
                    if (Math.abs(ad) > ans && Math.abs(ad) < k )
                        ans = ad;
                }
            }
            System.out.println(ans);
        }

    }



}
