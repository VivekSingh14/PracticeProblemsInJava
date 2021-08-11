package OOPConcepts.multithreading.example7;

public class ArrayPrinter {
    int arr[] = new int[5];
    boolean isOdd  = false;

    public ArrayPrinter(int[] arr){
        this.arr = arr;
    }

    synchronized void printOdd(int number){
        while(isOdd == false){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        arr[number]++;
        System.out.println(arr[number]);
        isOdd = false;
        notifyAll();
    }

    synchronized void printEven(int number){
        while(isOdd == true){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        arr[number]++;
        System.out.println(arr[number]);
        isOdd = true;
        notifyAll();
    }

}
