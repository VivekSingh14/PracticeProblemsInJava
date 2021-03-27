package basic_programs;

public class DuplicateAndMissingNumber {

    public static void main(String args[]){
        int arr[] = {1, 7, 2, 6, 3, 5, 4, 8, 1, 0, 9};
        int actualSum = 0;
        int expectedSum = (arr.length * (2*0+(arr.length-1)*1)) / 2;
        for(int i=0; i<arr.length;i++)
            actualSum += arr[i];

        System.out.println(expectedSum+" "+actualSum);

        var sumofnaturalNumber = (10 * 9)/2;

        System.out.println("duplicate number is "+(actualSum-sumofnaturalNumber));
        System.out.println("missing number is "+ (expectedSum-sumofnaturalNumber));
    }
    
}
