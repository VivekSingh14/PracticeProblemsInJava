package Inheritance;
public class Employee {
	int empid;
	String name;
	String dept;
	String designation;
	double basic = 20000;
	int mgrid;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empid, String name, String dept, String designation,int mgrid) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
		this.designation = designation;
		this.mgrid = mgrid;
	}
	public int getEmpid() {
		return empid;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public String getDesignation() {
		return designation;
	}
	public double getBasic() {
		return basic;
	}
	public int getMgrid() {
		return mgrid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public void setMgrid(int mgrid) {
		this.mgrid = mgrid;
	}
	
	
}
