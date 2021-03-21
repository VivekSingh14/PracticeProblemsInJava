package basic_programs;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();

        int arr[] = {1,2,3,4,5,6,7};

        int place = binarySearch(arr, 0, arr.length-1, num);
        System.out.println("number is at position: "+ (place+1));

        sc.close();
    }

    private static int binarySearch(int[] arr, int l , int r, int num) {

        if(r >= l){
            int mid  = l +(r-l)/2;
            if(arr[mid] == num){
                return mid;
            }

            if(arr[mid] > num){
                return binarySearch(arr, l, mid-1, num);   
            }

            return binarySearch(arr, mid+1, r, num);
        }

        return -1;
    }
}
