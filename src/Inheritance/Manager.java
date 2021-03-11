package Inheritance;

public class Manager extends Employee{
	int target = 30;
	int achieved;
	double bonus = 2000;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(int empid, String name, String dept, String designation, int mgrid,int achieved) {
		super(empid, name, dept, designation, mgrid);
		// TODO Auto-generated constructor stub
		//this.target=target;
		this.achieved = achieved;
		//this.bonus = bonus;
	}

	public int getTarget() {
		return target;
	}

	public int getAchieved() {
		return achieved;
	}

	public double getBonus() {
		return bonus;
	}
	public void setAchieved(int achieved) {
		this.achieved = achieved;
	}
	public void MgrSalary(){
		if(getTarget() >= getAchieved()){
			System.out.println("Salary: "+getBasic()*1.1+getBonus());
		}
	}
}
