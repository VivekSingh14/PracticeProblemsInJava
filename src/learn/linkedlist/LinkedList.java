package learn.linkedlist;

public class LinkedList {
	private Node head;
	
	public LinkedList(){
		head = null;
	}
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	
	
	public boolean insert(String name, int age, String address, boolean isMajor){
		Person p1 = new Person(name, age, address, isMajor);
		Node newNode = new Node(p1);
		
		if (head == null){
			head = newNode;
			return true;
		}
		
		Node tempNode = head;
		while(tempNode.getNext() != null){
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(newNode);
		
		return true;
	}
	
	public boolean reverse(){
		if (head == null || head.getNext()==null){
			return false;
		}
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr != null){
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		head = prev;
		return true;
	}
	
	//reverse the linkedList using recursion
	
//	public Node reverseRecursion(Node head){
//		if (head == null || head.getNext() == null){
//			return head;
//		}
//		Node rest = reverseRecursion(head.getNext());
//		head.getNext().setNext(head);
//		head.setNext(null);
//		
//		return rest;
//	}
	
	public void display(){
		Node tempNode = head;
		while(tempNode != null){
			System.out.println(tempNode.getPerson().toString());
			tempNode = tempNode.getNext();
		}
		System.out.println();
	}
}
