package Cdac;
import java.util.*;
public class TestingHashSet  {
	
	public static void main(String[] args) {
	Map<String,Person> personMap = new HashMap<String,Person>();	
		Person arr[] = {new Person(23,"Vivek",24800.67),
						new Person(22,"Rajat",23800.67),
						new Person(25,"Prateet",32000.45),
						new Person(24,"Ajay",18000.56)};
		
		for(int i=0;i<arr.length;i++){
			personMap.put(arr[i].getName(), arr[i]);
		}
		System.out.println("before sorting");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i].toString());
			System.out.println("----------------");
		}
		System.out.println("8888888888888");
		TreeSet<String> personSet = new TreeSet<>(personMap.keySet());
		List<String> list = new ArrayList<>(personMap.keySet());
		for(String name:personSet){
			System.out.println(name);
		}
		
		System.out.println("after sorting");
		for(String code:personSet){
			if(personMap.containsKey(code)){
				Object value = personMap.get(code);
				System.out.println(value.toString());
			}
		}
		
		
	}

}
