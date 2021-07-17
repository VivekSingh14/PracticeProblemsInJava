package OOPConcepts.AbstractClassLearn.example1;

public class Rectangle extends Shape{

    private int length;
    private int width;

    

    public Rectangle(String color, int length, int width) {
        super(color);
        System.out.println("Rectangle contructor called.");
        this.length = length;
        this.width = width;
    }



    @Override
    public double area() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle's color is "+super.getColor()+ " and the area is "+ area();
    }
    
}
