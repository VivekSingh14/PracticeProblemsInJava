public class SumOfPairtogivenNumber {
    public static void main(String args[]){
        // to find the given sum from pair of numbers
        int arr[] = {2,4,3,6,1,5,9,0};
        int num = 9;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]== num){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
