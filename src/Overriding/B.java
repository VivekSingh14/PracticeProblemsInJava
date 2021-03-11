package Overriding;
public class B extends A{
	public B(){
		super();
		System.out.println("B is called");
	}
	public void Y(){
		System.out.println("this is y of class B");
	}
	public void Z(){
		System.out.println("this is Z of class B");
	}
}
