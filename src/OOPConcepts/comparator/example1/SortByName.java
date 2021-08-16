package OOPConcepts.comparator.example1;

import java.util.Comparator;

public class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student arg0, Student arg1) {
        return arg0.name.compareTo(arg1.name);
    }
}
