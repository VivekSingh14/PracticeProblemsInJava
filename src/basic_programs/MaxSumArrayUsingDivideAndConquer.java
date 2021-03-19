package basic_programs;

public class MaxSumArrayUsingDivideAndConquer {
    public static void main(String args[]){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
         int max_sum = maxSubArraySum(arr, 0, arr.length-1);
         System.out.println(max_sum);
    }

    private static int maxSubArraySum(int[] arr, int l, int h) {
            if(l == h){
                return arr[l];
            }
            int m = (l+h)/2;


        return Math.max(Math.max(maxSubArraySum(arr, l, m), maxSubArraySum(arr, m+1, h)), maxCrossing(arr, l, m ,h));
    }

    private static int maxCrossing(int[] arr, int l, int m, int h) {
        int sum = 0;
        int left_sum = Integer.MIN_VALUE;
        for(int i = m ; i >= l ; i--){
            sum= sum+arr[i];
            if(sum > left_sum)
                left_sum = sum;
        }
        sum =0;
        int right_sum = Integer.MIN_VALUE;
        for(int i=m+1;i<=h;i++){
            sum = sum+arr[i];
            if(sum > right_sum)
                right_sum = sum;
        }
        return Math.max(left_sum+right_sum, Math.max(left_sum, right_sum));
    }
}
