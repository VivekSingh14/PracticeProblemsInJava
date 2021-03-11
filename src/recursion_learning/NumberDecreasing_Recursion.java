package recursion_learning;

public class NumberDecreasing_Recursion {

	public static void main(String[] args) {

		bar(1);
	}

	private static void bar(int i) {
		if (i > 5)
			return;
		bar(i + 1);
		System.out.println(i);
	}

}
