public class LargestAndSmallestInUnsorted {
    
    public static void main(String args[]){
        int arr[] = {3,1,2,8,5,7,6,13,20};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Minimum Number is: "+ min);
        System.out.println("Maxmimum Number is: "+ max);
    }
}
