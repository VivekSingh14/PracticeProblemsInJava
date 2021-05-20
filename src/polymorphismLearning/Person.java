package polymorphismLearning;

public class Person {
    public void walk(){
        System.out.println("Person class's walk called");
    }   

    public void run(){
        System.out.println("Person class's run called");
        walk();
    }
}
