package sortmorethanfield;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String args[]){
        List<Student> li = new ArrayList<Student>();

        Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);

        li.add(obj1);
        li.add(obj2);
        li.add(obj3);
        li.add(obj4);
        li.add(obj5);
        li.add(obj6);
            
        System.out.println("***********before sorting***********");
        for (Student student : li) {
            System.out.println(student.toString());
        }

        Collections.sort(li, new CustomComparator());

        System.out.println("************after sorting******************");
        for (Student student : li) {
            System.out.println(student.toString());
        }
    }
}
