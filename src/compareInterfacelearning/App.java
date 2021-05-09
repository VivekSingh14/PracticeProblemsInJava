package compareInterfacelearning;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String args[]){
        ArrayList<Student> li = new ArrayList<Student>();
        li.add(new Student(111, "bbb", "london"));
        li.add(new Student(131, "aaaa", "nyc"));
        li.add(new Student(121, "cccc", "jaipur"));
        System.out.println("******Unsorted********");
        for (Student student : li) {
            System.out.println(student.toString());
        }

        System.out.println("***************sorted based on roll no*************");
        Collections.sort(li, new SortByRoll());

        for (Student student : li) {
            System.out.println(student.toString());
        }
        
        System.out.println("***********sorted based on name************");
        Collections.sort(li, new SortByName());
        for (Student student : li) {
            System.out.println(student.toString());
        }






    }
}
