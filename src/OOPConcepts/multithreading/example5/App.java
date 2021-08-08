package OOPConcepts.multithreading.example5;

public class App {
    public static void main(String args[]){
        Person person = new Person();
        Thread th1 = new Thread(new One(10, person, false));
        Thread th2 = new Thread(new One(10, person, true));
        th1.start();
        th2.start();
    }
}
