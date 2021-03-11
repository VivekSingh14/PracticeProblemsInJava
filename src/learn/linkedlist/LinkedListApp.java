package learn.linkedlist;

public class LinkedListApp {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.insert("Vivek", 26, "kuch bhi", true);
		li.insert("Vaishali", 25, "bharat vihar", false);
		li.insert("Rekha", 47, "Shastri Nagar", true);
		li.insert("Surendra", 52, "VidhayakPuri", true);
		
		System.out.println("************************************");
		li.display();
		
		li.reverse();
		//LinkedList vivek = li.reverseRecursion(li.getHead());
		System.out.println("************************************");
		li.display();
		
		
	}

}
