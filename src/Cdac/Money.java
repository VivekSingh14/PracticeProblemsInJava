package Cdac;
public class Money {
	private int rs,paisa;
	public void set(int rs,int paisa) throws InvalidAmountExeption{
		if(rs >= 0 && paisa >= 0){
			this.rs = rs;
			this.paisa = paisa;
		}else{
			throw new InvalidAmountExeption("this amount can't be accpeted.");
		}
	}
	public void show(){
		System.out.println(rs+" : "+paisa);
	}
}
