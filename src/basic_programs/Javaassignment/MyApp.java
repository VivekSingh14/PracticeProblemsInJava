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

        Employee e1 = new Employee(1, "Vivek Singh", 15000, 25000);

        System.out.println("basic salary: "+e1.getBasicSalary());
        System.out.println("gross salary: "+e1.getGrossSalary());
        System.out.println("net salary: "+e1.getNetSalary());
        System.out.println("professional tax: " +e1.getPt());
    }
    
}
