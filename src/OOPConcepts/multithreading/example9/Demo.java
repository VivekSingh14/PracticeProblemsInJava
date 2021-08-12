package OOPConcepts.multithreading.example9;

public class Demo {
    public static void main(String args[]){
        B b = new B();

        Thread t1 = new Thread(b);
        t1.setName("Thread A");
        

        Thread t2 = new Thread(b);
        t1.setName("Thread B");

        t1.start();
        t2.start();



    }
}
