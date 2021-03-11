package recursion_learning;

public class Natural_Number_Print {

	public static void main(String[] args) {
		System.out.println(nNatural(50));
	}

	private static int nNatural(int i) {
		if (i == 1)
			return 1;
		return nNatural(i-1);
	}

}
