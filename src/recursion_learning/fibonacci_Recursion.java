package recursion_learning;

public class fibonacci_Recursion {

	public static void main(String[] args) {

		for (int i = 0; i <= 4; i++) {
			System.out.print(fibonacci(i)+ " ");
		}
	}

	private static int fibonacci(int i) {
		if (i <= 1) {
			return i;
		}
		return fibonacci(i-1) + fibonacci(i - 2);
	}

}
