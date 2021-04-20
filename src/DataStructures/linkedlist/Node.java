package DataStructures.linkedlist;

public class Node {
    private int age;
    private String name;
    private Node next;

    public Node(int age, String name){
        this.age = age;
        this.name = name;
        this.next = null;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
