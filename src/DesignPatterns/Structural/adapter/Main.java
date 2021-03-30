package DesignPatterns.Structural.adapter;

public class Main {
    public static void main(String args[]){
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.makeSound();

        ToyDuck toyDuck = new PlasticToyDuck();
        toyDuck.squeak();

        ToyDuck birdAdapter = new BirdAdapter(sparrow);
        birdAdapter.squeak();
        
    }
}
