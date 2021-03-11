package array.learn;

import java.util.Arrays;

public class Array_OperationsString {
	
	private char arr[] = null;
	private char arr1[] = null;
	public Array_OperationsString(char[] arr, char[] arr1) {
		this.arr = arr;
		this.arr1 = arr1;
	}
	
	public void traverseArray(){
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	//checking whether array is anagram of given subject.
	public boolean Anagram(){
		if (arr.length != arr1.length)
			return false;
		Arrays.sort(arr);
		Arrays.sort(arr1);
		for (int i=0;i<arr.length;i++){
			if (arr[i] != arr1[i])
				return false;
		}
		return true;
	}
}
