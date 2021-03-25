package basic_programs.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    private Node head;

    public LinkedList() {
        head = null;
    }
    
    public Node getHead() {
        return head;
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
    //insert method overloaded for testing purpose
    public boolean insert(Employee employee, Node node){
        Node newNode = new Node(employee, node);
 
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

    public void display(Node temp){
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

    public Node reverse(Node temp){
        Node prev = null;
        Node current = temp;
        Node forward = null;

        while (current != null) {
            forward = current.getNext();
            current.setNext(prev);
            prev = current;
            current = forward;
        }
        temp = prev;
        return temp;
    }

    public int lengthOfList(Node temp){
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.getNext();
        }
        
        return count;
    }

    public String thirdlastNode(){
        Node temp = head;
        int totalNodes = 0;
        while(temp != null){
            totalNodes++;
            temp = temp.getNext();
        }
         Node temp1 = head;
        for(int i=1; i < totalNodes-2; i++){
            temp1 = temp1.getNext();
        }
        
        return temp1.getEmployee().getFirstName();
    }

    public boolean isCircular(){
        Node temp = head;
        if(head == null)
        return true;

        temp = head.getNext();
        while(temp != null && temp != head){
            temp = temp.getNext();
        }
        return (temp == head);
    }


    public ArrayList<Integer> sum (Node temp, Node temp2){
            //int temparr[]= new int[2];
            List<Integer> list = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();
            //int temparr2[] = new int[2];
            ArrayList<Integer> sum = new ArrayList<>();

            while(temp != null){
                list.add(temp.getEmployee().getId());
                list2.add(temp2.getEmployee().getId());
                temp = temp.getNext();
                temp2 = temp2.getNext();
            }
            int remainder = 0;
            for(int i= list.size()-1; i >=0; i--){

                int tempSum = list.get(i)+list2.get(i)+remainder;
                if(tempSum > 9){
                    remainder = tempSum / 10;
                    tempSum = tempSum+ tempSum%10;
                    sum.add(tempSum);
                }else{
                    sum.add(tempSum);
                }
            }

        return sum;
    }

    public void removeDuplicate(Node headNode){
        Node temp1 = headNode;

        while(temp1 != null){
            Node temp2 = temp1.getNext();
            Node prev1 = null;
            while(temp2 != null){
                if(temp1.getEmployee().getId() == temp2.getEmployee().getId() && temp1 != temp2){
                prev1.setNext(temp2.getNext());
                break;
                }
                prev1 = temp2;
                temp2 = temp2.getNext();
            }
            temp1 = temp1.getNext();
        }

    }
}
