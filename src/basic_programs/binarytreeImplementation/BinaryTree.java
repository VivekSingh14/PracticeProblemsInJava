package basic_programs.binarytreeImplementation;

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
            System.out.print(test.getData()+" ");
            if(test.getPrevious()!= null){
                queue.add(test.getPrevious());
            }
            if(test.getNext() != null){
                queue.add(test.getNext());
            }

            queue.remove();

        }

    }

    public void PreOrder(Node tempRoot){
        if(tempRoot == null)
        return ;

        System.out.print(tempRoot.getData()+" ");
        PreOrder(tempRoot.getPrevious());
        PreOrder(tempRoot.getNext());
    }
    
    public void InOrder(Node tempRoot){
        if(tempRoot == null){
            return ;
        }
        InOrder(tempRoot.getPrevious());
        System.out.print(tempRoot.getData()+" ");
        InOrder(tempRoot.getNext());
    }

    public void PostOrder(Node tempRoot){
        if(tempRoot == null){
            return ;
        }
        PostOrder(tempRoot.getPrevious());
        PostOrder(tempRoot.getNext());
        System.out.print(tempRoot.getData()+" ");
    }

    public int leafNode(Node temproot){
        if(temproot == null)
            return 0;

        if(temproot.getPrevious() == null && temproot.getNext() == null)
            return 1;
        else
            return leafNode(temproot.getPrevious()) + leafNode(temproot.getNext());
    }

    //check if Binary tree is BST or not.
    public boolean IsBinarySearchTree(Node temproot){
        if(temproot == null){
            return true;
        }
        if(IsSubTreeLesser(temproot.getPrevious(), temproot.getData()) 
        && IsSubTreeGreater(temproot.getNext(), temproot.getData())
        && IsBinarySearchTree(temproot.getPrevious())
        && IsBinarySearchTree(temproot.getNext())){
            return true;
        }
        
        return false;
    }
    //checking if left subtree is greater or equal than the root
    private boolean IsSubTreeGreater(Node temproot1, int data) {
        if(temproot1 == null){
            return true;
        }
        if(temproot1.getData() >=data && IsSubTreeGreater(temproot1.getPrevious(), data) 
        && IsSubTreeGreater(temproot1.getNext(), data)){
            return true;
        }
        
        return false;
    }

    //checking if right subtree is lesser or equal than the root.
    private boolean IsSubTreeLesser(Node temproot2, int data) {

        if(temproot2 == null){
            return true;
        }
        if(temproot2.getData() <= data  && IsSubTreeLesser(temproot2.getPrevious(), data) 
        && IsSubTreeLesser(temproot2.getNext(), data)){
            return true;
        }
        return false;
    }

    public void leafNodes(Node temproot){
        if(temproot == null)
            return ;

        if(temproot.getPrevious() == null && temproot.getNext() == null){
            System.out.print(temproot.getData()+" ");
            return ;
        }

        if(temproot.getPrevious() != null){
            leafNodes(temproot.getPrevious());
        }
        if(temproot.getNext() != null){
            leafNodes(temproot.getNext());
        }
    }
    
}
