package basic_programs.binarytreeImplementation;

public class BinaryTreeApp {
    
    public static void main(String args[]){
        BinaryTree b1 = new BinaryTree();
        b1.insert(5);
        System.out.println(b1.getRoot().getData());
        b1.insert(3);
        System.out.println(b1.getRoot().getData());
        b1.insert(15);
        System.out.println(b1.getRoot().getData());
        b1.insert(12);
        System.out.println(b1.getRoot().getData());

        b1.insert(2);
        System.out.println(b1.getRoot().getData());

        b1.insert(4);
        System.out.println(b1.getRoot().getData());

        System.out.println("Max Element in tree: "+ b1.maxElement(b1.getRoot()));
        
        System.out.println("Min Element in tree: "+ b1.minElement(b1.getRoot()));

        System.out.println("Height of tree: "+ b1.heightTree(b1.getRoot()));

        System.out.println("*************level order traversal.**********");

        b1.levelOrderTraversal(b1.getRoot());
        
        System.out.println("****************PreOrver Traversal*********");

        b1.PreOrder(b1.getRoot());
        System.out.println();

        System.out.println("***************InOrder Traversal*************");
        b1.InOrder(b1.getRoot());
        System.out.println();

        System.out.println("***********PostOrder Traversal*************");
        b1.PostOrder(b1.getRoot());
        System.out.println();

        System.out.println("********leaf nodes in tree*********");
        System.out.println(b1.leafNode(b1.getRoot()));

        System.out.println("**************to check if binary tree is binary search tree or not**********************");
        System.out.println("is that tree, binary search tree ? "+b1.IsBinarySearchTree(b1.getRoot()));
    }
}
