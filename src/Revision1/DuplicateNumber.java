package Revision1;

public class DuplicateNumber {
    public static void main(String args[]){
        //To find the dupliate number from an array.
        int arr[] = {1,2,3,4,5,6,7,3,9,10};
        for(int i=0; i< arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                if(arr[i] == arr[j] && i != j){
                    System.out.println("duplicate number is: "+ arr[i]);
                    return ;
                }
            }
        }
    }
}
