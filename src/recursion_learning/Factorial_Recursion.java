package recursion_learning;

public class Factorial_Recursion {

	public static void main(String[] args) {
		int fact_res = fact(5);
		System.out.println(fact_res);
	}

	private static int fact(int i) {
		if (i ==1){
			return 1;
		}
		
		return i*fact(i-1);
	}

}
