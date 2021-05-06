package basic_programs;

import java.util.Scanner;

public class Prime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //rvision started.
        System.out.println("Enter the number");
        int num = sc.nextInt();
        boolean flag = false;
        for(int i = 2; i <= num/2; i++){
            if(num%i == 0){
                flag = true;
                break;
            }
        }

        if(flag == true){
            System.out.println(num+" number is not prime.");
        }else{
            System.out.println(num+" number is prime.");
        }
        sc.close();
    }
}
