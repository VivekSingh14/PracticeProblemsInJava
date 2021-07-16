package OOPConcepts.polymorphism.example2;

public class App {

    static{
        System.out.println("Static block can be run even before main method. ");
    }

    public static void main(String args[]){
        Man man;

        man = new Husband();
        man.drive();

        System.out.println("*********************************");

        man = new Father();
        man.drive();

        System.out.println("*********************************");

        //man = new Man();
        //man.drive();

    }
}
