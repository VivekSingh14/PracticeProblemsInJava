// Maximize the number of tasks in a given time constraint. 
//Example arr[]={4,2,1,2,5}-->  i -> work  arr[i] -> time taken to complete work.
//time constraint -> T=8

package GreedyAlgoExamples;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeNumberOfTasks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {4,2,1,2,5};
        System.out.println("Enter the time limit.");
        int T = sc.nextInt();
        System.out.println("Maximum number of achievable tasks "+  maximiseTasks(arr,T));
        sc.close();
    }

    private static int maximiseTasks(int[] arr, int t) {
        Arrays.sort(arr);
        int currentTime = 0;
        int numberOftasks = 0;

        for(int i=0;i<arr.length;i++){
            currentTime += arr[i];
            if(currentTime > t){
                break;
            }
            numberOftasks++;
        }

        return numberOftasks;
    }
}
