package arraylist.learn;

public class Address {
	private String line1;
	private String area;
	private String city;
	private String state;
	private int pincode;
	
	public Address(String line1, String area, String city, String state, int pincode) {
		this.line1 = line1;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", area=" + area + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	
}
