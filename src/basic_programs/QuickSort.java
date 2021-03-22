package basic_programs;

public class QuickSort {
    public static void main(String args[]){
        int arr[] = {0, -32, -6, -19, -33, 2, 6,1};
        quickSort(arr, 0, arr.length-1);
        for(int i =0; i< arr.length;i++)
            System.out.print(arr[i]+" ");

        System.out.println();

    }

    private static void quickSort(int[] arr, int start, int end) {
        
        if(start >= end)
        return ;

        int partitionIndex = Partition(arr, start, end);
        quickSort(arr, start, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }

    private static int Partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pIndex = start;
        for(int i = start; i < end; i++ ){
            if(arr[i] <= pivot){
                int temp = arr[i];
                arr[i] = arr[pIndex];
                arr[pIndex] = temp;
                pIndex = pIndex+1;
            }
        }
        int tempo = arr[end];
        arr[end] = arr[pIndex];
        arr[pIndex] = tempo;

        return pIndex;
    }
}
