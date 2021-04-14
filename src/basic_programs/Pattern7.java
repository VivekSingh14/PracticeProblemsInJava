package basic_programs;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]){
        //added the pattern 7.
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows");
        int rows  = sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            int count = i;
            for(int k=1;k<=i;k++){
                System.out.print(count);
                count++;
            }
            for(int l=count-2; l >= i; l--){
                System.out.print(l);
            }
            System.out.println();
        }


        sc.close();
    }
}
