package basic_programs.Javaassignment;

public class Employee {

    private int employeeId;
    private String employeeName;
    private double basicSalary;
    private double hra;
    private double medical;
    private double pf;
    private static final double pt = 200;
    private double netSalary;
    private double grossSalary;

    public Employee() {}

    public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.medical = medical;
        setHra(basicSalary);
        setPf(basicSalary);
        setGrossSalary();
        setNetSalary();
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getHra() {
        return hra;
    }

    public void setHra(double basic) {

        this.hra = basic*0.5;
    }

    public double getMedical() {
        return medical;
    }

    public void setMedical(double medical) {
        this.medical = medical;
    }

    public double getPf() {
        return pf;
    }

    public void setPf(double basic) {
        this.pf = basic*0.12;
    }

    public double getPt() {
        return pt;
    }


    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary() {
        this.netSalary = getGrossSalary()-(getPt()+getPf());
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary() {
        this.grossSalary = getBasicSalary() + getHra()+getMedical();
    }

    
    
    
}
