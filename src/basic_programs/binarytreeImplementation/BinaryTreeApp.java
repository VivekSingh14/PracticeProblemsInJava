package basic_programs.binarytreeImplementation;

public class BinaryTreeApp {
    
    public static void main(String args[]){
        BinaryTree b1 = new BinaryTree();
        b1.insert(3);
        System.out.println(b1.getRoot().getData());
        b1.insert(5);
        System.out.println(b1.getRoot().getData());
        b1.insert(15);
        System.out.println(b1.getRoot().getData());
        b1.insert(12);
        System.out.println(b1.getRoot().getData());

        System.out.println("Max Element in tree: "+ b1.maxElement(b1.getRoot()));
        
        System.out.println("Min Element in tree: "+ b1.minElement(b1.getRoot()));

        
    }
}
