package OOPConcepts.Collections.TreeSetExample7;

import java.util.TreeSet;

public class App {
   public static void main(String args[]){

       TreeSet<String> set1 = new TreeSet<String>();

       String[] arr = {"Vivek", "Singh", "GsLab", "Pune", "Baner"};

        for (String word : arr) {
            if(!set1.contains(word)){
                set1.add(word);
            }
        }

        for (String key : set1) {
            System.out.println(key);
        }

   } 
}
