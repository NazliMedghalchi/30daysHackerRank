import java.util.LinkedList;
import java.util.NoSuchElementException;



/**
 * Created by Nazli on 2016-07-18.
 */
//public class QueueAndStack {
        // Write your code here.
//        public class StackNode{
//            StackNode top;
//            char dataS;
//
//            StackNode(){
//                this.dataS = ' ';
//                top = null;
//            }
//            public void pushS(char c){
//                this.dataS = c;
//                StackNode nextNode = new StackNode();
//            }
//
//            public char popS(){
//                StackNode oldTop = this.top;
//                char data = oldTop.dataS;
//                this.top = top -1;
//                return data;
//            }
//
//
//        }
//        public class QueueNode{
//            QueueNode nextQ;
//            QueueNode firstQ;
//            char dataQ;
//
//            QueueNode(){
//                this.dataQ = ' ';
//                firstQ = null;
//                nextQ = null;
//            }
//
//            public void enqueue(char c){
//                QueueNode first = this.firstQ;
//                this.nextQ = new QueueNode();
//
//                next.dataQ = c;
//                this.firstQ = first;
//            }
//
//            public char dequeue(){
//                char data = this.dataQ;
//                QueueNode first = this.nextQ;
//                if (first == null)
//                    System.out.println("Queue is empty");
//                return data;
//            }
//        }
//        public Solution(){
//            StackNode stack = new StackNode();
//            QueueNode queue = new QueueNode();
//        }
//
//        public char popCharacter() {
//            StackNode stack = null;
//            return stack.popS();
//
//        }
//
//        public void pushCharacter(char c) {
//            stack.pushS(c);
//
//        }
//
//        public void enqueueCharacter(char c){
//            queue.enqueue(c);
//        }
//
//        public char dequeueCharacter() throws NoSuchElementException{
//            return queue.dequeue();
//        }

        /* Using Java Satck and Queue
        *
        */

import java.io.*;
import java.util.*;

public class QueueAndStack {
    // Write your code here.
    Stack<Character> stack;
    Queue<Character> queue;
    public QueueAndStack() {
        stack = new Stack<Character>();
        queue = new LinkedList<>();
    }

    public char popCharacter() {
        return stack.pop();

    }

    public void pushCharacter(char c) {
        stack.push(c);

    }

    public void enqueueCharacter(char c){
        queue.add(c);
    }

    public char dequeueCharacter() throws NoSuchElementException{
        return queue.remove();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        QueueAndStack p = new QueueAndStack();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}