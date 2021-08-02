package OOPConcepts.multithreading.example4;

public class One implements Runnable{
    private static int Id = 0;
    public void run (){
        Id++;
    } 
    public synchronized void display(){
        System.out.println(Id);
    }

}
