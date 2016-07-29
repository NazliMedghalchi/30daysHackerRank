/**
 * Created by Nazli on 2016-07-18.
 */
import java.lang.reflect.Method;


class Generics {
    //Write your code here
    public static <T> void printArray(T[] input){
        for (T t : input)
            System.out.println(t);

    }

    public static void main(String args[]){
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = { "Hello", "World" };

        printArray( intArray  );
        printArray( stringArray );

        if(Generics.class.getDeclaredMethods().length > 2){
            System.out.println("You should only have 1 method named printArray.");
        }
    }
}
