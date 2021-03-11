package Cdac;
public class BoxingTest {

	public static void main(String[] args) {
		int number = 20;
		System.out.println(number);
		String str = String.valueOf(number);
		System.out.println(str);
		String str1 = "Vivek";
		Object obj = str1;
		System.out.println(obj);
		obj = number;
		System.out.println(obj);
		String str2 = "10";
		System.out.println(str2);
		int num = Integer.parseInt(str2);
		System.out.println(num+"  "+str2.hashCode()+" "+obj.hashCode());
		double num5 = 10.66666;
		System.out.println(num5);
		int num6 = (int)num5;
		System.out.println(num6);
		double temp = num6;
		System.out.println(temp);
	}

}
