package OOPConcepts.multithreading.example2;

public class A implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread "+ Thread.currentThread().getId()+ " is running.");
        
    }
    
}
