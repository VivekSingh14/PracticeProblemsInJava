package DataStructures.linkedlist;

public class LinkedList {
    private Node head;

    public LinkedList(){
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }


    public boolean insert(int age, String name){
        Node newnode = new Node(age, name);
        if(head == null){
            head = newnode;
            return true;
        }
        Node temp = head;
            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            if(temp.getAge() < newnode.getAge()){
                temp.setNext(newnode);
            }
            return true;
    }

    public void display(){
        Node temp = head;

        while(temp != null){
            System.out.println(temp.getAge()+" "+temp.getName());
            temp = temp.getNext();
        }
    }

    
}
