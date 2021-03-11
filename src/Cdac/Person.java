package Cdac;
public class Person {
	private int age;
	private String name;
	private double salary;
	public Person(){
		age = 0;
		name = null;
		salary = 0.0;
	}
	public Person(int age, String name, double salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString(){
		return getAge()+":"+getName()+":"+getSalary();
	}
	
}
