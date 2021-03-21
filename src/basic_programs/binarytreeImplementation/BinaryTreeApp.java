package basic_programs.binarytreeImplementation;

public class BinaryTreeApp {
    
    public static void main(String args[]){
        BinaryTree b1 = new BinaryTree();
        Node root = b1.insert(10, b1.getRoot());
        Node root1 = b1.insert(5, b1.getRoot());
        Node root2 = b1.insert(15, b1.getRoot());
        Node root3 = b1.insert(20, b1.getRoot());

        System.out.println(root.getData()+" "+root1.getData()+" "+ root2.getData()+" "+ root3.getData());
        
    }
}
