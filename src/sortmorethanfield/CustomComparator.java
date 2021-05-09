package sortmorethanfield;

import java.util.Comparator;

public class CustomComparator implements Comparator<Student>{
        @Override
        public int compare(Student a, Student b) {
            int res1 = a.getName().compareTo(b.getName());
            int res2 = a.getAge().compareTo(b.getAge());


            return (res1 == 0 ) ? res2:res1;
        }
        
    }
