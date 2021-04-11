package DesignPatterns.Structural.adapter;

//Adapter class
public class BirdAdapter implements ToyDuck{
        Bird bird;
        
        public BirdAdapter(Bird bird){
            this.bird = bird;
        }

        public void squeak(){
            System.out.println("Squeak");
        }
}
