package OOPConcepts.comparator.example2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Student {
    String name;
    int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }


    static class CustomerSortingComparator implements Comparator<Student>{

        @Override
        public int compare(Student st1, Student st2) {
            
            int NameCompare = st1.getName().compareTo(st2.getName());
            int AgeCompare =  st1.getAge() - st2.getAge();
            return (NameCompare == 0) ? AgeCompare : NameCompare;
        }
        
    }

    public static void main(String args[]){
        List<Student> al = new ArrayList<>();
        Student obj1 = new Student("Ajay", 27);
        Student obj2 = new Student("Sneha", 23);
        Student obj3 = new Student("Simran", 37);
        Student obj4 = new Student("Ajay", 22);
        Student obj5 = new Student("Ajay", 29);
        Student obj6 = new Student("Sneha", 22);
  
        al.add(obj1);
        al.add(obj2);
        al.add(obj3);
        al.add(obj4);
        al.add(obj5);
        al.add(obj6);

        Iterator<Student> custIterator = al.iterator();
  
        System.out.println("Before Sorting:\n");
        while (custIterator.hasNext()) {
            System.out.println(custIterator.next());
        }

        Collections.sort(al,
                         new CustomerSortingComparator());
  
        System.out.println("\n\nAfter Sorting:\n");
        for (Student customer : al) {
            System.out.println(customer);
        }
    
    }
    
}
