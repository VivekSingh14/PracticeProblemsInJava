package OOPConcepts.AbstractClassLearn.example1;

public class App {
    public static void main(String args[]){


        Shape shape = new Circle("Red", 4.0);
        System.out.println(shape.toString());
        shape.display();

        System.out.println("************Hey this is for testing will be removed. *************");

        Circle circle  = new Circle("Blue", 5.0);
        System.out.println(circle.toString());
        circle.display();
    }
}
