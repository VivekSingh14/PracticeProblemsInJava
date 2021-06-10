package DpProblems;

public class MaxSumContiguousSubArray {
    public static void main(String args[]){
        int []arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        int max_sum = maxSum(arr, n);

        System.out.println(max_sum);
    }

    public static int maxSum(int []arr, int n){
        int initial_max = arr[0];
        int max_so_far = arr[0];

        for(int i=1; i<n;i++){
            initial_max = Math.max(arr[i], initial_max+arr[i]);
            max_so_far = Math.max(initial_max, max_so_far);
        }

        return max_so_far;
    }
}
