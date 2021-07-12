package multithreading_Basics;

public class Basic2 implements Runnable {

    public void run(){
        System.out.println("Run method executed. ");
    }

    public static void main(String args[]){
        Basic2 basic = new Basic2();
        
        System.out.println("Executing run method using Basic2 class object.");
        basic.run();


        Thread t1 = new Thread(basic);
        t1.start();
    }
}
