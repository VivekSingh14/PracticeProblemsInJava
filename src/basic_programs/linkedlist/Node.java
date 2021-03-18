package basic_programs.linkedlist;

public class Node {
    private Employee employee;
    private Node next;

    public Node(Employee employee) {
        this.employee = employee;
        this.next = null;
    }
    //testing purpose:::for testing if list is circular or not.
    public Node (Employee employee, Node node){
        this.employee = employee;
        this.next = node;
    }
    
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    
}
