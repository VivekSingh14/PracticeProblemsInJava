package DesignPatterns.Structural.adapter;

public class Sparrow implements Bird{

    public void fly(){
        System.out.println("flying");
    }

    public void makeSound(){
        System.out.println("Chirp Chirp");
    }
    
}
