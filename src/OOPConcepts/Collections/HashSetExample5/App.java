package OOPConcepts.Collections.HashSetExample5;

import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String args[]){
        HashSet<String> set1 = new HashSet<String>();

        set1.add("Vivek");
        set1.add("Singh");

        String[] arr = {"Vivek", "Singh", "GsLab", "Pune", null, "Baner"};

        for (String word : arr) {
            if(!set1.contains(word)){
                set1.add(word);
            }
        }

        System.out.println("******************");
        for (String keys : set1) {
            System.out.println(keys);
        }

        System.out.println("********************");

        Iterator<String> itr = set1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
    }   
}
