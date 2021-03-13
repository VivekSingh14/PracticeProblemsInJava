package basic_programs;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the rows");
        int rows = sc.nextInt(); 
        
        for(int i =0; i<rows; i++){
            for(int j=0;j<=i;j++ ){
                System.out.print(" ");
            }
            for(int k=1; k<= rows-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
