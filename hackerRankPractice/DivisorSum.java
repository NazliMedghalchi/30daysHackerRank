/**
 * Created by Nazli on 2016-07-18.
 */
import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class CalculatorD implements AdvancedArithmetic{

    //Write your code here

    public int divisorSum(int n){
        int sum =0;
        for (int i=1; i<=n; i++){
            if (n%i == 0)
                sum += i;
        }
        return sum;
    }
}

class DivisorSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new CalculatorD();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }


}
