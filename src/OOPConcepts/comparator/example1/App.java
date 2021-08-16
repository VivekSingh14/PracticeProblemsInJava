package OOPConcepts.comparator.example1;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String args[]){
        ArrayList<Student> ar = new ArrayList<>();
        ar.add(new Student(111, "bbbb", "london"));
        ar.add(new Student(131, "aaaa", "nyc"));
        ar.add(new Student(121, "cccc", "jaipur"));

        System.out.println("Unsorted");
        for(int i = 0; i< ar.size();i++){
            System.out.println(ar.get(i));
        }

        Collections.sort(ar, new SortByRoll());

        System.out.println("Sorted by Rollno");
        for(int i = 0; i< ar.size();i++){
            System.out.println(ar.get(i));
        }

        Collections.sort(ar, new SortByName());
        
        System.out.println("Sorted by Name");
        for(int i = 0; i< ar.size();i++){
            System.out.println(ar.get(i));
        }

    }
}
