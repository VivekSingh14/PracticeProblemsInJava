//This problem asked to find all pairs of integers within an array which sum to a specified value. 
package basic_programs;

import java.util.Scanner;

public class CountPairSpecifiedSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value");
        int value  = sc.nextInt();
        int arr[] = {1,3,5,6,4};
        int count = 0;

        for(int i = 0; i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+ arr[j] == value){
                    count++;
                    break;
                }
            }
        }

        System.out.println("total pairs: "+count);
        sc.close();
    }
}
