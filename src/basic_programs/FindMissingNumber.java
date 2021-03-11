package basic_programs;

import java.util.Scanner;

public class FindMissingNumber {
    public static void main(String args[]){
         int arr[] = {1,2,3,4,5,6,8,9,10,11,12};
         int terms = arr.length+1;
         int actualSum = 0;
         for(int i =0;i<arr.length;i++){
              actualSum = actualSum+arr[i];
         }
         int expectedSum = terms * (terms+1)/2;

         System.out.println("missing number "+ (expectedSum - actualSum));
         
    }
}
