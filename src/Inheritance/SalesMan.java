package Inheritance;
public class SalesMan extends Employee{
	double incentive=100;
	int target =10;
	int sales;
	public SalesMan() {
		// TODO Auto-generated constructor stub
	}
	public SalesMan(int empid, String name, String dept, String designation, int mgrid,int sales) {
		super(empid, name, dept, designation, mgrid);
		// TODO Auto-generated constructor stub
		//this.incentive = incentive;
		this.sales = sales;
	}
	public double getIncentive() {
		return incentive;
	}
	public int getTarget() {
		return target;
	}
	public int getSales() {
		return sales;
	}
	/*public void setIncentive(double incentive) {
		this.incentive = incentive;
	}*/
	/*public void setTarget(int target) {
		this.target = target;
	}*/
	public void setSales(int sales) {
		this.sales = sales;
	}
	
	public void salesSalary(){
		if(getSales() >= getTarget()){
			System.out.println("Salary:"+getBasic()*1.1);
		}
	}

}
