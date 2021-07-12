package multithreading_Basics;

public class Basic1 extends Thread{
    private int rollno;

    public void run(){
        rollno = 1;
        System.out.println("checking inside run method whether it is alive or not "+isAlive());
        System.out.println(rollno);
        System.out.println("Inside the run method "+getName());

    }

    public static void main(String args[]){
        Basic1 obj = new Basic1();
        obj.start();

        System.out.println("Thread name "+obj.getName());
        System.out.println("Thread ID "+obj.getId());
        System.out.println("Thread Priority "+obj.getPriority());
        System.out.println("Thread is alive or not from main method "+obj.isAlive());


        System.out.println("**************Setting up the name*************** ");
        obj.setName("Mini Thread");
        
        System.out.println(Basic1.currentThread());
        System.out.println("Inside the main method "+obj.getName());


    }
}
