package basic_programs;

import java.util.Scanner;

public class StringReverseAndUpper {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence.");
        String sentence = sc.nextLine();

        String arr[] = sentence.split(" ");
        for(int i=0; i<arr.length;i++){
            if(i%2 == 0){
                System.out.print(arr[i].toUpperCase());
            }else{
                for(int j = arr[i].length()-1; j >= 0; j-- ){
                    System.out.print(arr[i].charAt(j));
                }
            }
            System.out.print(" ");
        }

        sc.close();
    }
}
