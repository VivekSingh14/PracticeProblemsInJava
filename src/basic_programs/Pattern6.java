package basic_programs;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows.");
        int rows  = sc.nextInt();
        int countFlag = 0;
        for(int i = 1; i<=rows;i++){
            for(int j = rows-i; j>= 1; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print(k);
            }
            for(int l=countFlag;l>=1;l--){
                System.out.print(l);
            }
            countFlag++;
            System.out.println();
        }
        sc.close();
    }
}
