package OOPConcepts.ExceptionalHandling.example3;

public class App {

    public static void fun(int a, int b) throws ArithmeticException{
        
        System.out.println(a/b);
        System.out.println("Hey from fun()");
        throw new ArithmeticException("Test");

    }

    public static void main(String args[]){
        int a = 1;
        int b = 0;
        try{
        fun(a, b);
        System.out.println("Hey from try block");
        }catch(Exception e){
            System.out.println("check your inputs again.");
            //return;
            System.exit(0);
        }finally{
        System.out.println("Hey after catch block. ");
        }
    }
    
}
