package basic_programs.linkedlist;

public class Employee {
    private int id;
    private int age;
    private String firstName;
    private String lastName;
    private String officeLocation;

    public Employee(int id, int age, String firstName, String lastName, String officeLocation) {
        this.id = id;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeLocation = officeLocation;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getOfficeLocation() {
        return officeLocation;
    }
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

}
