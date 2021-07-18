package OOPConcepts.InterfaceLearn.example1;

public class App implements Player{
    
    @Override
    public void display() {
        System.out.println("display called from TestClass.");
        
    }

    public static void main(String args[]){
        App app = new App();
        app.display();
        System.out.println(id);
    }
}
