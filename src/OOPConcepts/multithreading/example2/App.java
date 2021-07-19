package OOPConcepts.multithreading.example2;

public class App {
    public static void main(String args[]){
        A a = new A();
        a.run();

        System.out.println("*********************************");
        A b = new A();
        Thread thread = new Thread(b);
        thread.start();
        thread.run();
    }
}
