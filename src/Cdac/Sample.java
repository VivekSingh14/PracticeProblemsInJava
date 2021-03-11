package Cdac;
import java.io.*;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s2 = ‘null’;
		 String s3 = (String)"abc";
		 byte i= 1;
		 byte j = 2;
		 int k ;
		 k = i+j;
		 String s1 = null;
		//String s4 = (String) ‘\ufeed’;
		 System.out.println(s3);
		 System.out.println(k);
		 int x= 100;
		 double y = 100.0;
		 boolean b = (x==y);
		 System.out.println(b);
		 test(2,3);
		 String s = "xyz";
		 s = s.toUpperCase();
		 System.out.println(s.toUpperCase());
		 String s0 = s.replace('Y', 'y');
		 s0 = s0+"abc";
		 System.out.println(s0);
		 
		 for(int l=0;l<args.length;l++){
			 System.out.println(args[l]);
		 }
	}
	static long test(int i,float j){
		System.out.println((int)3.14d);
		return (long)j;
	}

}
