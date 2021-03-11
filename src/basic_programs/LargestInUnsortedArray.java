package basic_programs;

public class LargestInUnsortedArray {
        public static void main(String args[]){
            int numberArray[] = {2,1,6,3,4,9,10,2,8,13,17};
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int i = 0; i<numberArray.length;i++ ){
                if(numberArray[i] > max){
                    max = numberArray[i];
                }
            }

            for(int i = 0; i<numberArray.length;i++ ){
                if(numberArray[i] < min){
                    min = numberArray[i];
                }
            }

            System.out.println(max);
            System.out.println(min);
        }    
}
