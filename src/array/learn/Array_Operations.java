package array.learn;

public class Array_Operations {
	private int arr[] = null;

	public Array_Operations(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for (int i = 0; i < arr.length; i++)
			arr[i] = Integer.MIN_VALUE;
	}

	public void traverseTheArray() {
		try {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {
			System.out.println("Array is out of range.");
		}
	}

	public void insert(int position, int valuetobeadded) {
		try {
			if (arr[position] == Integer.MIN_VALUE) {
				arr[position] = valuetobeadded;
				System.out.println("Successfully inserted " + valuetobeadded + " at location " + position);
			} else {
				System.out.println("This cell is already occupied  by another value.");
			}
		} catch (Exception e) {
			System.out.println("Invalid index to access array");
		}
	}
		
	public void accessingCell(int cellno){
		try{
			System.out.println(arr[cellno]);
		}catch (Exception e){
			System.out.println("Invalid Index");
		}
	}
	public void searchInAnArray(int valueToBeSearched){
		
			for(int i=0; i<arr.length; i++){
				if(arr[i] == valueToBeSearched){
					System.out.println("Value found !");
					System.out.println("Index of " + valueToBeSearched + " is: " + i);
					return;
				}
			}
	}
	
	public void deleteTheValue(int deleteValueFromThisCell){
		try{
			arr[deleteValueFromThisCell] = Integer.MIN_VALUE;
		}catch(Exception e){
			System.out.println();
			System.out.println("Cant delete the value as cell# provided is not in the range of array !");
		}
	}
	
	public void reverseAnArray(){
		try{
			int startIndex = 0;
		
		int endIndex = arr.length-1;
		while(endIndex > startIndex){
			swap(endIndex, startIndex);
			startIndex++;
			endIndex--;
		}
		}catch (Exception e){
			System.out.println("Array is out of range.");
		}
		traverseTheArray();
	}
	
	public void deleteTheArray(){
		arr = null;
		System.out.println("Array is deleted successfully.");
	}
	
	public void swap(int endIndex, int startIndex){
			int temp = arr[startIndex];
			arr[startIndex]= arr[endIndex];
			arr[endIndex] = temp;
	}
	
	
}
