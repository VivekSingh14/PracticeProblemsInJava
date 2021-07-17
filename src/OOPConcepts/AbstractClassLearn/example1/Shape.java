package OOPConcepts.AbstractClassLearn.example1;

public abstract class Shape {
    private String color;

    public abstract double area();

    public abstract String toString();

    public Shape(String color){
        System.out.println("Shape constructor called.");
        this.color =  color;
    }

    public void display(){
        System.out.println("This is display method from Shape class");
    }

    public String getColor(){
        return this.color;
    }
}
