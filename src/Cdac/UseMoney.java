package Cdac;
public class UseMoney {
	public static void main(String[] args) {
		Money m1 = new Money();
		try{
			m1.set(-20, 20);
			m1.show();
		}catch(InvalidAmountExeption e1){
			System.out.println(e1.getMessage());
		}
		
	}

}
