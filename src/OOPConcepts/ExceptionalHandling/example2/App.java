package OOPConcepts.ExceptionalHandling.example2;

public class App {
    public static void main(String args[]){
        int i = 2;
        int j = 0;

        try{
            System.out.println("Before Exception");
            System.out.println(i/j);
            System.out.println("After Expression in try block.");
        }catch(ArithmeticException e){
            System.out.println("Exception Handled with following details:");
            System.out.println(e.toString());

        }finally{
            System.out.println("After expression in finally block.");
        }

        System.out.println("Normal operations");
    }   
}
