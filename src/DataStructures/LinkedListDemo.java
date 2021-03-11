package DataStructures;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l1  = new LinkedList();
		l1.add("Vivek");
		l1.add("Singh");
		l1.add(1);
		l1.add(14);
		
		Object str  = l1.get(2);
		
		System.out.println(str);
	}

}
