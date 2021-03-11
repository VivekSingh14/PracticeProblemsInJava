package basic_programs;

class Swap {
    public static void main(String args[]){
        int one = 2;
        int two = 3;

        one = one + two;
        two = one - two;
        one = one - two;

        System.out.println("one: "+ one + " two: " + two);
    }
}