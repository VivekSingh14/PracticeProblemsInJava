package basic_programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = sc.nextLine();
        char arr[] = new char[str.length()];
        int j = str.length();
        for(int i = str.length()-1; i >= 0;i--){
                arr[j-i-1] = str.charAt(i);
                //direct traversing the string in reverse order
                System.out.print(str.charAt(i));
        }
        //here traversing the char array after taking char from string in reverse order.
        System.out.println();
        System.out.println("*****************");
        for(int i = 0; i< arr.length; i++)
         System.out.print(arr[i]);

        System.out.println();
        sc.close();
    }
}
