package arraylist.learn;
import java.util.*; 

public class ArrayListLearn {

	public static void main(String[] args) {
		//add strings to list
		List<String> arraylist = new ArrayList<String>();
			arraylist.add("Vivek");
			arraylist.add("Singh");
			arraylist.add("Vaishali");
			arraylist.add("Rekha");
			arraylist.add("Surendra");
			//arraylist.remove(2);
			//traversing the list using for each 
			for(String itr : arraylist)
				System.out.println(itr);
			System.out.println("****************");
			
			
			//converting the ArrayList into object array. 
			Object arr[] = arraylist.toArray();
			//arr.toString();
			for(int i=0; i<arr.length; i++){
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			System.out.println("****Extracting the list here *****");
			//Convert the Array into Object type ArrayList.
			List<Object> a1 = Arrays.asList(arr);
			for(Object l1: a1)
				System.out.println(l1);
			
			
			
			//ArrayList operations with generic class objects
			Address ad1 = new Address("14 Bharat Vihar B", "Jamdoli", "Jaipur", "Rajasthan", 302031);
			Address ad2 = new Address("15 Bharat Vihar C", "Jam nagr", "Surat", "Gujarat", 302032);
			Address ad3 = new Address("16 Bharat Vihar D", "Baner", "Pune", "Maharashtra", 411045);
			Address ad4 = new Address("17 Bharat Vihar A", "Marathalli", "Bengaluru", "Karnataka", 302033);
			Person p1 = new Person("Vivek", 26, ad1, true);
			Person p2 = new Person("Ajay", 26, ad2, false);
			Person p3 = new Person("Suraj", 28, ad3, true);
			Person p4 = new Person("Athul", 29, ad4, true);
			
			List<Person> list1 = new ArrayList<>();
			list1.add(p1);
			list1.add(p2);
			list1.add(0, p3);
			list1.add(p4);
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
			for(Person per : list1){
				System.out.println(per.getName()+" belongs to " + per.getAddress().toString());
			}
			
			for(Person per: list1){
				if(per.getAddress().getArea() == "Jamdoli"){
					per.getAddress().setArea("Malviya Nagar");
				}
			}
			System.out.println("()()()()()()()()()()()()()");
			for(Person per : list1){
				System.out.println(per.getName()+" belongs to " + per.getAddress().toString());
			}
			
			
			
	}

}
