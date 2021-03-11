package array.learn;

public class ArrayApp {

	public static void main(String[] args) {
//		Array_Operations ao1 = new Array_Operations(9);
//		ao1.insert(0, 10);
//		ao1.insert(1, 20);
//		ao1.insert(2, 30);
//		ao1.insert(3, 40);
//		ao1.insert(4, 50);
//		ao1.insert(5, 60);
//		ao1.insert(6, 70);
//		ao1.insert(7, 80);
//		ao1.insert(8, 90);
//		//ao1.insert(9, 100);
//		ao1.traverseTheArray();
//		System.out.println("************");
//		ao1.accessingCell(5);
//		ao1.accessingCell(10);
//		ao1.searchInAnArray(40);
//		System.out.println("************");
//		//ao1.deleteTheValue(3);
//		//ao1.traverseTheArray();
//		//System.out.println("************");
//		//ao1.deleteTheArray();
//		//ao1.traverseTheArray();
//		
//		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
//		ao1.reverseAnArray();
		
		//checking if given string is anagram or not.
//		char arr[] = {'R','E','S','T','F','U','L'};
//		char arr1[] = {'F','L','U','S','T','E','R'};
//		Array_OperationsString os1 = new Array_OperationsString(arr,arr1);
//		os1.traverseArray();
//		System.out.println("---------------------");
//		System.out.println("Given arrays are Anagram: " + os1.Anagram());
		
		DuplicateInArray dp1 = new DuplicateInArray(10);
		int temp[] = {1,2,3,4,5,2,6,1,3,5};
		dp1.Insert(temp);
		dp1.checkDuplicate();
		System.out.println("****************");
		dp1.checkDuplicateUsingMap();
		System.out.println("*******duplicate using Absolute*********");
		dp1.findDuplicateAbs();
	}

}
