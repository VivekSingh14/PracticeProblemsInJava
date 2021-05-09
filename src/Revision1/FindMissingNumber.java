package Revision1;

public class FindMissingNumber {
    public static void main(String args[]){
        //To find the missing number from n natural numbers
        int arr[] = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};
        int actualSum = 0;
        for(int a : arr){
            actualSum += a;
        }

        int expectedSum = ((arr.length + 1) * (arr.length+2)) / 2;

        System.out.println("Missing Number is: "+ (expectedSum - actualSum));
    }
}
