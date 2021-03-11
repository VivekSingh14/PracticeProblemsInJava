package arraylist.learn;

public class Person {
	
	private String name;
	private int age;
	private Address address;
	private boolean isMajor;
	public Person(String name, int age, Address address, boolean isMajor) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.isMajor = isMajor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isMajor() {
		return isMajor;
	}
	public void setMajor(boolean isMajor) {
		this.isMajor = isMajor;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
