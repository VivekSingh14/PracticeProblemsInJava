package Cdac;
public class ExceptionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 2;
		try{
			if(num2==0){
				throw new ArithmeticException("number can't be divided by 0");
			}else{
				
				System.out.println(num1/num2);
			}
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("this is finally");
		}
		System.out.println("main method");
	}

}
