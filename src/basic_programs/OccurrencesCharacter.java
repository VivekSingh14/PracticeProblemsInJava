package basic_programs;

import java.util.Arrays;
import java.util.Scanner;

public class OccurrencesCharacter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        
        char arr[] = str.toCharArray();
        Arrays.sort(arr);
        char arrCopy[] = arr.clone();

        int j = 0;
        for(int i = 1; i < arrCopy.length;i++){
              if(arrCopy[i] != arrCopy[j]){
                     arrCopy[++j] = arrCopy[i];
              }

        }
        int lengthNew = ++j;
        for( int i=0;i<lengthNew;i++){
            int count = 0;
            for(int s = 0 ;s < arr.length;s++){
                if(arrCopy[i] == arr[s]){
                    count++;
                }
            }
            System.out.print(arrCopy[i] +" "+ count);
        }




    }
}
