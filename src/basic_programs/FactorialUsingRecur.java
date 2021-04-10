package basic_programs;

import java.util.Scanner;

public class FactorialUsingRecur {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num  = sc.nextInt();
        //finding factorial
        System.out.println(factorial(num));
        sc.close();
    }    

    public static int factorial(int num){
        if(num == 1){
            return 1;
        }

        return num*factorial(num-1);
    }
}
