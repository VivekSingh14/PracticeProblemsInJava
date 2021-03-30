package DesignPatterns.Creational.singleton;

public class Singleton {
    private static Singleton singleton = null;
    private int data;

    private Singleton(){}

    private Singleton(int data){
        this.data = data;
    }
    
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton(14);
        }
        return singleton;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
    
}
