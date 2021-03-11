package basic_programs;

import java.util.Scanner;

public class Armstrong {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check armstrong.");
        int num = sc.nextInt();
        int temp = num;
        int armstrong = 0;
         while(temp > 0){
            int remain = temp%10;
            armstrong = (int) (armstrong + Math.pow(remain, 3));
            temp = temp/10;
         }
         if(num == armstrong){
             System.out.println(armstrong +" number is armstrong.");
         }else{
             System.out.println("not an armstrong");
         }

    }   
}
