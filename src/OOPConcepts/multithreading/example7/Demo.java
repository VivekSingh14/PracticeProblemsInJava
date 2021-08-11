package OOPConcepts.multithreading.example7;

public class Demo {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        ArrayPrinter ap = new ArrayPrinter(arr);

        Thread th1 = new Thread(new One(4, ap, false));
        Thread th2 = new Thread(new One(4, ap, true));

        th1.start();
        th2.start();
    }
}
