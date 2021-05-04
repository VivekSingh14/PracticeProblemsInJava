public class ReverseInArray {
    public static void main(String args[]){
        //reverse the array in place.
        int arr[] = {1,2,3,4,5};
        int len = arr.length-1;
        for(int i=0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[len];
            arr[len] = temp;
            len--; 
        }

        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
}
