package Revision2;

public class MaxSumSubArray {
    public static void main(String args[]){
        int arr[] = {5,4,-1,7,8};
        int dp[] = new int[arr.length];
        dp[0] = arr[0];
        int max = dp[0];
        
        for(int i=1; i<arr.length;i++){
            if(dp[i-1] > 0){
                dp[i] = arr[i]+dp[i-1];
            }else{
                dp[i] = arr[i]+0;
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
