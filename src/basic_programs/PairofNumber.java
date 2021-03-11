package basic_programs;

import java.util.Scanner;

public class PairofNumber {
    public static void main(String args[]){
        int arr[] = {1,2,0,3,-1,4,-2,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+ arr[j] == num && i != j){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        sc.close();
    }
    
}
