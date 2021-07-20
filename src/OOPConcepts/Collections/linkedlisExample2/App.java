package OOPConcepts.Collections.linkedlisExample2;

import java.util.LinkedList;

public class App {
    public static void main(String args[]){
        LinkedList<Integer> l1 = new LinkedList<Integer>();

        for(int i=100; i<=120;i+=2){
            l1.add(i);
        }

        System.out.println(l1);

        for(Integer element : l1){
            System.out.print(element+" ");
        }
        System.out.println();
            
    }   
}
