package OOPConcepts.multithreading.example7;

public class One implements Runnable{
    private int max;
    private ArrayPrinter print;
    private boolean isEvenNumber;
    public One(int max, ArrayPrinter print, boolean isEvenNumber) {
        this.max = max;
        this.print = print;
        this.isEvenNumber = isEvenNumber;
    }
    @Override
    public void run() {
        int number = isEvenNumber == true ? 0 : 1;

        while(number <= max){
            if(isEvenNumber){
                print.printEven(number);
            }else{
                print.printOdd(number);
            }
            number += 2;
        }
    }
}
