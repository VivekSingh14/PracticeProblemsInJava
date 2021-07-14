package OOPConcepts.Inheritance.example1;

public class App {
    public static void main(String args[]){

        System.out.println("*****************object for mountainBike, which extends Bicycle*********************");
        MountainBike  mountainbike = new MountainBike(4, 20, 9);
        System.out.println(mountainbike.toString());

        System.out.println("---------------------------------------------------------------------");
        System.out.println("**********************Bicycle object only **************************");

        Bicycle bicycle = new Bicycle(3, 10);
        System.out.println(bicycle.toString());

        System.out.println("------applying brake----------");
        bicycle.applyBrake(2);
        System.out.println(bicycle.toString());
    }    
}
