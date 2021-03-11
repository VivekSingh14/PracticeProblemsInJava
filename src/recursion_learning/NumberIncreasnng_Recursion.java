package recursion_learning;

public class NumberIncreasnng_Recursion {

	public static void main(String[] args) {

		bar(3);
		System.out.println("Main");
	}

	private static void bar(int i) {
		if (i < 1)
			return;
		bar(i - 1);
		System.out.println(i);
	}

}
