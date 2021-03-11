package learn.linkedlist;

public class Person {
	
	private String name;
	private int age;
	private String address;
	private boolean isMajor;
	public Person(String name, int age, String address, boolean isMajor) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.isMajor = isMajor;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + ", isMajor=" + isMajor + "]";
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
