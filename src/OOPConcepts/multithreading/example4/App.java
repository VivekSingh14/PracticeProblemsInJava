package OOPConcepts.multithreading.example4;

public class App {
    public static void main(String args[]){

        System.out.println(Thread.currentThread().getName());

        One o = new One();
        Thread t1 = new Thread(o);
        t1.start();
        System.out.println(t1.getName());
        o.display();


        One t = new One();
        Thread t2 = new Thread(t);
        t2.start();
        System.out.println(t2.getName());
        o.display();
        

        

    }    
}
