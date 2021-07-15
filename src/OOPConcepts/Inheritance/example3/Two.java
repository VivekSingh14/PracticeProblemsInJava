package OOPConcepts.Inheritance.example3;

public class Two extends One{
    public void displayTwo(){
        displayOne();
        System.out.println("displayTwo method is called from class Two");
    }
}
