package OOPConcepts.Collections.LinkedHashSetExample6;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class App {
    public static void main(String args[]){
        LinkedHashSet<String> set1 = new LinkedHashSet<>();

        //set1.add("Vivek");
        //set1.add("Singh");

        String[] arr = {"Vivek", "Singh", "GsLab", "Pune", null, "Baner"};

        for (String word : arr) {
            if(!set1.contains(word)){
                set1.add(word);
            }
        }

        Iterator<String> itr   = set1.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
