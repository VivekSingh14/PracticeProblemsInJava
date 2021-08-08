package OOPConcepts.multithreading.example5;

public class Person {
    private boolean flag = false;

    public synchronized void printEven(int number){
        while(flag == false){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Even: "+number);
        flag = false;
        notifyAll();
    }

    public synchronized void printOdd(int number){
        while(flag == true){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Odd: "+ number);
            flag = true;
            notifyAll();
        }
    }
}
