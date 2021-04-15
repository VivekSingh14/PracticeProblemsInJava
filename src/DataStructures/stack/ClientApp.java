package DataStructures.stack;

public class ClientApp {
    public static void main(String args[]){
        Stack stack1 = new Stack();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        stack1.push(4);
        stack1.push(5);
        stack1.push(6);
        System.out.println("**********popping out the stack**********");
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        System.out.println("*********Stack is empty now.***********");
    }
}
