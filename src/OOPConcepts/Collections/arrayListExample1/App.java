package OOPConcepts.Collections.arrayListExample1;

import java.util.ArrayList;

public class App {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("list size is: "+ list.size());
        for(int i =101; i<=140; i+=2)
        list.add(i);

        System.out.println("************************");
        for (Integer element : list) {
         System.out.print(element+ " ");   
        }
        System.out.println("\n***********************");

        System.out.println("now list size is: "+ list.size());

        System.out.println(list.lastIndexOf(109));

        System.out.println(list.get(list.indexOf(109)));

        System.out.println(list);
    }   
}
