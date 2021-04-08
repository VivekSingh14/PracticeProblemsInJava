package basic_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaxNumFromDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while(num > 0){
            list.add(num%10);
            num = num/10;
        }
        int arr[] = new int[list.size()];
        for(int i=0; i<list.size();i++){
            arr[i] = list.get(i);
        }

        Arrays.sort(arr);

        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }

        System.out.println();
    }
}
