package OOPConcepts.multithreading.example1;

public class App {
    public static void main(String args[]){
        MultiThreadingDemo m1 = new MultiThreadingDemo();
        m1.start();


        MultiThreadingDemo m2 = new MultiThreadingDemo(1, "Vivek");
        m2.start();

    }
}
