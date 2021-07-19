package OOPConcepts.multithreading.example1;

public class MultiThreadingDemo extends Thread{

    private int id;
    private String name;

    public MultiThreadingDemo(){}
    public MultiThreadingDemo(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void run (){
        System.out.println("Thread "+ Thread.currentThread().getId()+ " is running.");
        display();
    }
    private void display(){
        System.out.println("Student ID is: "+ id + " and name is "+ name);
    }

}
