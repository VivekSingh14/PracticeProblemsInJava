package Revision1;

public class FindMultipleDuplicates {
    public static void main(String args[]){
        //added the method to find out multiple duplicate
        int arr[] = {1,4,3,1,2,5,6,2,7,0,5};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j] && i != j){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
