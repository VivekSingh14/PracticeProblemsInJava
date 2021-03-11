package array.learn;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateInArray {
	private int arr[] = null;
	
	public DuplicateInArray(int size){
		arr = new int[size];
		for(int i=0; i<arr.length;i++)
			arr[i] = Integer.MIN_VALUE;
	}
	public void Insert(int[] temp){
		for(int i=0;i<arr.length;i++)
			arr[i] = temp[i];
	}
	
	//duplicate finding using brute-force method (O(n)^2)
	public void checkDuplicate(){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1; j <arr.length; j++){
				if(arr[i]==arr[j]){
					System.out.println("Duplicate" + arr[i]);
				}
			}
		}
	}
	//duplicate finding using hashMap and time complexity is O(n) but more space complexity.
	public void checkDuplicateUsingMap(){
		Map<Integer, Integer> map1 = new HashMap<>();
		int count  = 0;
		boolean dup = false;
		
		for(int i=0;i<arr.length;i++){
			if(map1.containsKey(arr[i])){
				count = map1.get(arr[i]);
				//System.out.println(count);
				map1.put(arr[i], count+1);
			}else{
				map1.put(arr[i], 1);
			}
		}
		for(Entry<Integer, Integer> entry : map1.entrySet()){
			if(entry.getValue() > 1){
				System.out.println(entry.getKey()+ " ");
				dup = true;
			}
		}
		if(!dup){
			System.out.println("-1");
		}
	}
	//finding the duplicate n O(n) tie complexity and without taking extra space.
		public void findDuplicateAbs(){
			for(int i=0;i<arr.length; ++i){
				if (arr[Math.abs(arr[i])] > 0){
					arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
				}else{
					System.out.println(Math.abs(arr[i])+ " is a duplicate.");
				}
			}
		}
	
	
	
	
}
