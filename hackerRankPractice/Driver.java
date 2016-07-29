import java.io.*;
import java.util.*;

public class Driver {

    public static void main(String[] args) {
//        Class vs. Instance
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                int age = sc.nextInt();
                Person p = new Person(age);
                p.amIOld();
                for (int j = 0; j < 3; j++) {
                    p.yearPasses();
                }
                p.amIOld();
                System.out.println();
            }
                sc.close();
        }
}