package DataStructures.stack;

public class Stack {
    private Node top;

    public Stack(){
        top = null;
    }

    

    public boolean push(int data){
        
        Node newnode  = new Node(data);
        
        if(top == null){
            top = newnode;
            return true;
        }

        newnode.setNext(top);
        top = newnode;
        return true;
    }

    public void pop(){

        System.out.println(getTop().getData());
        setTop(getTop().getNext());
    }



    public Node getTop() {
        return top;
    }



    public void setTop(Node top) {
        this.top = top;
    }
    
}
