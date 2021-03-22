package basic_programs.binarytreeImplementation;

public class BinaryTreeApp {
    
    public static void main(String args[]){
        BinaryTree b1 = new BinaryTree();
        b1.insert(10);
        System.out.println(b1.getRoot().getData());
        b1.insert(5);
        System.out.println(b1.getRoot().getData());
        b1.insert(15);
        System.out.println(b1.getRoot().getData());
        b1.insert(20);
        System.out.println(b1.getRoot().getData());

        
    }
}
