package basic_programs.Javaassignment;

public class MyApp {
    public static void main(String args[]){
        MyDate date1 = new MyDate();

        date1.setDay(27);
        date1.setMonth(03);
        date1.setYear(2021);

        date1.initDate();

        MyDate date2 = new MyDate();
        date2.initDate();
    }
    
}
