package DesignPatterns.Creational.prototype;

public class Client {
    public static void main(String args[]){
        ColorStore.getColor("Blue").addColor();
        ColorStore.getColor("black").addColor();
        ColorStore.getColor("Black").addColor();
        ColorStore.getColor("blue").addColor();
    }    
}
