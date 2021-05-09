package compareInterfacelearning;

public class Student {
    private int rollno;
    private String name, address;
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        return "Student [address=" + address + ", name=" + name + ", rollno=" + rollno + "]";
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
}
