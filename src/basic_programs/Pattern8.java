package basic_programs;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String args[]){
        //added pattern 8
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows  = sc.nextInt();
        int temp = rows;
        for(int i = 1; i <= rows; i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            
            for(int k=temp; k>=1; k--){
                System.out.print("*");
            }
            for(int l=temp-1; l >=1; l--){
                System.out.print("*");
            }
            temp--;
            System.out.println();


        }

        sc.close();
    }
}
