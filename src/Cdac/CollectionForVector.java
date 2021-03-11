package Cdac;
import java.util.*;
public class CollectionForVector {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		String arr[] = {"vivek","singh","vaishali","surendra","rekha"};
		@SuppressWarnings("rawtypes")
		Vector v = new Vector();
		for(int i=0;i<arr.length;i++){
			v.add(arr[i]);
		}
			for(int i=0;i<v.size();i++){
				System.out.println((String)v.get(i));
			}
			System.out.println("-----------------------");
			//Collections.sort(v);
			for(int i=0;i<v.size();i++){
				System.out.println((String)v.get(i));
			}
			System.out.println("-----------------------");
			@SuppressWarnings("rawtypes")
			Iterator itr = v.iterator();
			while(itr.hasNext()){
				System.out.println((String)itr.next());
			}
			System.out.println("-----------------------");
			ListIterator litr = v.listIterator();
			while(litr.hasNext()){
				System.out.println(litr.next());
			}
			System.out.println("-----------------------");
			while(litr.hasPrevious()){
				System.out.println(litr.previous());
			}
			System.out.println("-----------------------");
			for(Object o:v){
				System.out.println(o);
			}
	}

}
