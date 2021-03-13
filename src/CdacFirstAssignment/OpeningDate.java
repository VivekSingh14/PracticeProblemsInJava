package CdacFirstAssignment;

public class OpeningDate {
    private int year;
    private int month;
    private int day;
    public OpeningDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    @Override
    public String toString() {
        return "OpeningDate [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

    

}
