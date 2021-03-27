package DesignPatterns.Creational;

public class SingletonPatternApp {
    public static void main(String args[]){
    Singleton obj1 = Singleton.getInstance();
    System.out.println(obj1.getData());

    Singleton obj2 = Singleton.getInstance();
    System.out.println(obj2.getData());
    }
}
