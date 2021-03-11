package Cdac;

public class Num_Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 2;
		int num2 = 3;
		System.out.println("before swapping numbers are" + num1 + " " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("aftter swapping numbers are" + num1 + " " + num2);
	}

}
