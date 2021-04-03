package learn.DScdacProblems.ll;

public class Node {
    private String Name;
    private int age;
    private Node next;

    public Node(){}

    public Node(String name, int age) {
        Name = name;
        this.age = age;
        this.next = null;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    
    
}
