package OOPConcepts.Inheritance.example2;

public class App {
    public static void main(String args[]){

        System.out.println("----------------Reference type is FeatureEntity.----------------");
        FeatureEntity obj1 = new FeatureEntity();

        obj1.one();
        obj1.two();
        obj1.three();
        

        System.out.println("----------------Reference type is Standard1----------------");
        Standard1 obj2 = new FeatureEntity();
        obj2.one();
        obj2.two();

        System.out.println("----------------Reference type is Standard2------------------");
        Standard2 obj3 = new FeatureEntity();
        obj3.three();
    }   
}
