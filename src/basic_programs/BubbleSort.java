package basic_programs;

public class BubbleSort {
    public static void main(String args[]){
        int arr[] = {3,2,7,5,4,1,0,8,23,15,12};
        
        for(int i = 0; i< arr.length-1;i++){
            for(int j = i+1;j< arr.length;j++){
                  if(arr[i] > arr[j]){
                      int temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;
                  }
            }
        }

        for(int i = 0; i< arr.length;i++ ){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

    }
}
