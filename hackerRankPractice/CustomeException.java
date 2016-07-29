/**
 * Created by Nazli on 2016-07-15.
 */
import java.util.*;
import java.io.*;

class NegativeNumberException extends Exception{
    NegativeNumberException(String s){
        super(s);
    }
}
class Calculator{
    int n;
    int p;
    Calculator () {
        this.n = n;
        this.p = p;
    }

    int power(int n, int p) throws NegativeNumberException {
        int ans = 1;

        if ( p >= 0 && n >= 0){
            for ( int i =0; i<p; i++)
                ans = ans * n;
            return ans;
        }

        else {
            throw new NegativeNumberException("n and p should be non-negative");

        }



    }
}
public class CustomeException {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);

            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
