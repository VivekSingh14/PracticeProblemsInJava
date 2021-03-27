package basic_programs.Javaassignment;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double medical;
    private double pf;
    private double pt;
    private double netSalary;
    private double grossSalary;

    public Employee() {}

    public Employee(int employeeId, String employeeName, double basicSalary, double hra, double medical, double pf,
            double pt, double netSalary, double grossSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.hra = hra;
        this.medical = medical;
        this.pf = pf;
        this.pt = pt;
        this.netSalary = netSalary;
        this.grossSalary = grossSalary;
    }

    
    
}
