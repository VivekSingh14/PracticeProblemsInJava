package OOPConcepts.multithreading.example3;

public class One implements Runnable{
    private int max;
    private Printer print;
    private boolean isEvenNumber;
    public One(int max, Printer print, boolean isEvenNumber) {
        this.max = max;
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }
    
    @Override
    public void run() {
        int number = isEvenNumber == true ? 2 : 1;
        while (number <= max) {

            if (isEvenNumber) {
                //System.out.println("Even :"+ Thread.currentThread().getName());
                print.printEven(number);
                //number+=2;
            } else {
                //System.out.println("Odd :"+ Thread.currentThread().getName());
                print.printOdd(number);
                // number+=2;
            }
            number += 2;
        }
        
    }
    
    
}
