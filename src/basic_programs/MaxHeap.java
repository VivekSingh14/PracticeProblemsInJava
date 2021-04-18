package basic_programs;

public class MaxHeap {
    public static void main(String args[]){
        int arr[] = {40, 35, 15,  30, 10, 12, 6, 5, 20, 50};
        System.out.println("Heap before insertion "+ arr[arr.length-1]);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Heap after insertion ");
        insert(arr, arr.length-1);
    }

    public static void insert(int arr[], int len){
        int temp = arr[len];
        int i = len;

        while(i > 1 && temp > arr[i/2]){
            arr[i] = arr[i/2];
            i = i/2;
        }
        arr[i] = temp;

        for(int j=0;j<arr.length;j++){
                System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
