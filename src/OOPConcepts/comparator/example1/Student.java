package OOPConcepts.comparator.example1;

public class Student {
    int rollno;
    String name, address;
    
    public Student (int rollno, String name, String address){
        this.rollno = rollno;
        this.name  = name;
        this.address = address;

    }

    @Override
    public String toString() {
        return "Student [address=" + address + ", name=" + name + ", rollno=" + rollno + "]";
    }
    
}
