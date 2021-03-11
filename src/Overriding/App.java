package Overriding;

public class App {

	public static void main(String[] args) {
		A a = new B();
		B b3 = (B)a;
		System.out.println(b3.getClass());
		System.out.println(a.getClass());
		System.out.println(b3.hashCode());
		System.out.println(a.hashCode());
		a.Y();
		b3.Y();
	}

}
