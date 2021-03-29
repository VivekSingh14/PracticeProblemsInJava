package Overriding;

public class App {

	public static void main(String[] args) {
		//A a = new A();
		//a.X();
		//a.Y();

		//B b = new B();
		//b.X();
		//b.Y();
		//b.Z();
		
		//showing same result 
		//C c = new C();
		//c.displayTop();
		//or
		//Top top = new C();
		//top.displayTop();


		//A a = new A();
		//a.displayTop();

		//B b = new B();
		//b.displayTop();

		//A a = new B();
		//a.displayTop();

		Top t1 = new A();
		t1.displayTop();

		Top t2 = new B();
		t2.displayTop();

		Top t3 = new C();
		t3.displayTop();

		/*A a = new B();
		B b3 = (B)a;
		System.out.println(b3.getClass());
		System.out.println(a.getClass());
		System.out.println(b3.hashCode());
		System.out.println(a.hashCode());
		a.Y();
		b3.Y();*/
	}

}
