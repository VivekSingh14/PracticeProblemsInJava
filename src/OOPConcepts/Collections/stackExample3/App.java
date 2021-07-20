package OOPConcepts.Collections.stackExample3;

import java.util.Iterator;
import java.util.Stack;

public class App {
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();

        stack.push("Demo0");
        stack.push("Demo1");
        stack.push("Demo2");
        stack.push("Demo3");
        stack.push("Demo4");

        Iterator<String> itr = stack.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();

        System.out.println(stack.peek());

        System.out.println("**************************");
        
        stack.pop();

        itr = stack.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println();

        System.out.println(stack.peek());

    }
}
