package OOPConcepts.Inheritance.example1;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return "MountainBike [seatHeight=" + seatHeight + "]";
    }
}
