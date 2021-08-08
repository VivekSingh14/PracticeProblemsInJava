package OOPConcepts.multithreading.example5;

public class One implements Runnable{

    private int max;
    private Person person;
    private boolean isEvenNumber;
    public One(int max, Person person, boolean isEvenNumber) {
        this.max = max;
        this.person = person;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        
        int number = isEvenNumber == true ? 2:1;
        while(number <= max){
            if(isEvenNumber){
                person.printEven(number);
            }else{
                person.printOdd(number);
            }
            number += 2; 
        }
        
    }
    
}
