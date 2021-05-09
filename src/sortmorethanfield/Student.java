package sortmorethanfield;

import java.util.Comparator;

public class Student {
    String Name;
    int Age;
    public Student(String Name, Integer Age)
    {
        this.Name = Name;
        this.Age = Age;
    }
  
    public String getName() { return Name; }
  
    public void setName(String Name) { this.Name = Name; }
  
    public Integer getAge() { return Age; }
  
    public void setAge(Integer Age) { this.Age = Age; }
  
    // overriding toString() method
    @Override public String toString()
    {
        return "Customer{"
            + "Name=" + Name + ", Age=" + Age + '}';
    } 
}
