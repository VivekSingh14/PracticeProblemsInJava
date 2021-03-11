package Cdac;
import java.util.*;
public class StackUsingLinkedList<T> {
	public LinkedList<String> li = new LinkedList<>();
	public void push(String str){
		li.add(str);
		return;
	}
	public String pop(){
		
		String str = null;
		str = li.getLast();
		li.remove(li.size()-1);
		/*if(li.size()==1){
			String str1 = li.getFirst();
			System.out.println(str1);
			li.removeFirst();
			return str1;
			
		}*/
		return str;
	}
	public boolean underflow(){
		if(li.isEmpty()){
			return true;
		}else{
			return false;
		}
	}
	public int getsize(){
		return li.size();
	}
	public static void main(String[] args) {
		StackUsingLinkedList<String> s1 = new StackUsingLinkedList<>();
		
		//StackUsingLinkedList.pop();
		s1.push("vivek");
		s1.push("Singh");
		s1.push("vaishali");
		while(!s1.underflow()){
		System.out.println(s1.pop());
		/*if(s1.underflow()){
			System.out.println("stack underflow");
		}*/
		}
	}

}
