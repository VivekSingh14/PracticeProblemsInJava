package basic_programs;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String str = sc.nextLine();
        boolean flag = false;
        int j = str.length()-1;
        for(int i = 0; i < str.length()/2; i++ ){
                if(str.charAt(i) != str.charAt(j)){
                    flag = true;
                    break;
                }
                j--;
        }
        if(flag == true){
            System.out.println("String is not palindrome.");

        }else{
            System.out.println("yes, it is palindrome.");
        }
        sc.close();
    }
}
