package Memory_Learn;

/**
 * @author ADMIN
 *
 */
public class Var_WR_Memory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int localvalue = 5;
		calculate(localvalue);
		System.out.println(localvalue);
	}
	public static void calculate(int calcValue){
		calcValue = calcValue*100;
		
	}
}
