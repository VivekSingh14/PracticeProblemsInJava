package basic_programs;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]){
          //added one comment and statement
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the rows");
          int rows = sc.nextInt();
          //int temp = rows-1;
          for(int i = 1 ; i <= rows;i++){
              for(int j = 1; j <= rows-i;j++){
                  System.out.print(" ");
              }
              for(int k = 1 ; k <= i; k++){
                  System.out.print("*");
              }
              System.out.println();
          }
          System.out.println("testing purpose");
          sc.close();
    }
    
}
