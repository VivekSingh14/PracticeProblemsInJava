package recursion_learning;

public class Generate_Strings {
	
	static char array[] = new char[]{'a','b','c'};
	
	public static void main(String[] args) {
		Binary(array.length);

	}

	private static void Binary(int n) {
		if (n <1){
			String str = new String(array);
			System.out.println(str);
		}else{
			array[n-1] = 0;
			Binary(n-1);
			array[n-1] = 1;
			Binary(n-1);
		}
		
	}

}
