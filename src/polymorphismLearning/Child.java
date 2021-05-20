package polymorphismLearning;

public class Child extends Person {
    public Child(){
        super();
    }
    public void walk(){
        System.out.println("Child class's walk called");
    }
    public void run(){
        super.run();
        System.out.println("Child class's run called");
    }
}
