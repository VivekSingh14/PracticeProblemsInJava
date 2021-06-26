public class Test {
    public static void main(String args[]){
        for(int i =1 ;i<=100;i++){

            //condition for divisibility 3 and 5
            if(i %3 == 0 && i %5 == 0){
                System.out.println("fizzbuzz");
            // division 3
            }else if( i % 3 == 0){
                System.out.println("fizz");
            }else if(i % 5 == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
}
