import java.util.*;

/**
 * Created by Nazli on 2016-07-17.
 */

public class StackImp {
    List<Character> stackImp;
    char data;
    int top;
    StackImp(char data){
        this.stackImp = null;
        this.data = data;
    }

    public void push (char c){
        this.stackImp.add(c);
    }

    public char pop (){
        return this.stackImp.get(this.stackImp.lastIndexOf(stackImp));
    }
public static void main (String[] args){
    StackImp s;
    System.out.println("Enter the values to put in stack: ...");
    ArrayList<String> input = new ArrayList<>();
    int i = 0;
    Scanner scan = new Scanner(System.in);
    while(scan.hasNext()){
        input.add(scan.nextLine());
    }

}
}
