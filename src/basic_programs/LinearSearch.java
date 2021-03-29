package basic_programs;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();
        int arr[] = {5,3,1,6,7,9,18};
        sc.close();
        boolean flag  = false;
        int i;
        for( i =0; i< arr.length;i++){
            if(arr[i] == num){
                flag = true;
                break;
            }
        }
        if(flag == true){
        System.out.println("Number at position: "+ (i+1));
        }else{
            System.out.println("Number not found.");
        }
    }

}
