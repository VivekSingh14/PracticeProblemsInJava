package OOPConcepts.multithreading.example3;

public class Demo {
    public static void main(String args[]){
        Printer print  = new Printer();
        Thread t1 = new Thread(new One(10, print, false));
        Thread t2 = new Thread(new One(10, print, true));
        t1.start();
        t2.start();
    }
}
