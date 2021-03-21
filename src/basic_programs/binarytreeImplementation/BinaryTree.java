package basic_programs.binarytreeImplementation;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        this.root = null;
    }

    public Node getRoot() {
        return root;
    }

    public Node insert(int data, Node root){
        Node newNode = new Node(data);

        if(root == null){
            root = newNode;
        }else if(data <= root.getData()){
            root.setPrevious(insert(data, root.getPrevious()));
        }else{
            root.setNext(insert(data, root.getNext()));
        }

        return root;
    }
    

    

    
    
}
