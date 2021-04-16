package DataStructures.stack;

public class Stack {
    private Node top;

    public Stack(){
        top = null;
    }

    

    public boolean push(int data){
        
        Node newnode  = new Node(data);
        
        if(isStackEmpty()){
            top = newnode;
            return true;
        }

        newnode.setNext(top);
        top = newnode;
        return true;
    }

    public void pop(){
        
        if(isStackEmpty()){
            System.out.println("Stack underflow.");
            return;
        }

        System.out.println(getTop().getData());
        setTop(getTop().getNext());
    }

    public boolean isStackEmpty(){
        if(getTop() == null){
            return true;
        }
        return false;
    }

    public Node getTop() {
        return top;
    }



    public void setTop(Node top) {
        this.top = top;
    }
    
}
