package Memory_Learn;
public class Customer_App {

	public static void main(String[] args) {
		Customer c1 = new Customer();
		System.out.println(c1.getName());
		renameCustomer(c1);
		System.out.println(c1.getName());
		
		Customer c2;
		c2 = new Customer();
		c2 = new Customer();
	}
	public static void renameCustomer(Customer c2){
		c2.setName("Vivek Singh");
	}
}
