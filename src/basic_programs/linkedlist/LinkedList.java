package basic_programs.linkedlist;

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }
    
    

    public boolean insert(Employee employee){
           Node newNode = new Node(employee);
    
           if(head == null){
               head = newNode;
               return true;
           }

           Node temp = head;
           while(temp.getNext() != null){
               temp = temp.getNext();
           }
           temp.setNext(newNode);

        return true;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.getEmployee().getFirstName());
            temp = temp.getNext();
        }
    }

    public String middleNode(){
        Node slow = head;
        Node fast = head;

        while(fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }

        return slow.getEmployee().getFirstName();
    }


}
