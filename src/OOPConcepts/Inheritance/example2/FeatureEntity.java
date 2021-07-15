package OOPConcepts.Inheritance.example2;

public class FeatureEntity implements Standard1, Standard2{

    @Override
    public void three() {
        System.out.println("Method declared in Standard2");
        System.out.println("implemented by FeatureEntity class");
        System.out.println("******************");
    }

    @Override
    public void two() {
        System.out.println("Method declared in Standard1");
        System.out.println("implemented by FeatureEntity class");
        System.out.println("******************");
        
    }

}
