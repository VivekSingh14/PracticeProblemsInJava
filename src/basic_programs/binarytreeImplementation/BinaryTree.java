package basic_programs.binarytreeImplementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int data){
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true){
            if(data < temp.getData()){
                if(temp.getPrevious() == null){
                    temp.setPrevious(newNode);
                    return true;
                }
                temp = temp.getPrevious();
            }else{
                if(temp.getNext() == null){
                temp.setNext(newNode);
                return true;
                }
                temp = temp.getNext();
            }        
        }
    }
    
    public int maxElement(Node temp){

        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        return temp.getData();
    }
    
    public int minElement(Node temp){

        while(temp.getPrevious() != null){
            temp = temp.getPrevious();
        }

        return temp.getData();

    }

    public int heightTree(Node temp){

        if(temp == null){
            return -1;
        }

        int leftHeight = heightTree(temp.getPrevious());
        int rightHeight = heightTree(temp.getNext());

        return Math.max(leftHeight, rightHeight)+1;
    }

    public void levelOrderTraversal(Node tempRoot){
        Node temp = tempRoot;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(temp);
        while(!queue.isEmpty()){
            Node test = queue.peek();
            System.out.println(test.getData());
            if(test.getPrevious()!= null){
                queue.add(test.getPrevious());
            }
            if(test.getNext() != null){
                queue.add(test.getNext());
            }

            queue.remove();

        }

    }
    
    
}
