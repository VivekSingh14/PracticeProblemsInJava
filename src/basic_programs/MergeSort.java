package basic_programs;

public class MergeSort {
    public static void main(String args[]){
        int arr[] = {0, -32, -6, -19, -33, 2, 6,1};
        mergesort(arr);

        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    private static void mergesort(int[] arr) {
        if(arr.length < 2){
            return;
        }
        int mid = arr.length/2;
        int left[] = new int[mid];
        int right[] = new int[arr.length-mid];

        for(int i=0;i<mid;i++)
        left[i] = arr[i];

        for(int i=mid;i<arr.length;i++)
        right[i-mid] = arr[i];
        mergesort(left);
        mergesort(right);
        Merge(left, right, arr);
    }

    private static void Merge(int[] left, int[] right, int[] arr) {
        int i =0, j=0, k=0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while( i < left.length){
            arr[k] = left[i];
            i++;
            k++;
        }

        while( j < right.length){
            arr[k] = right[j];
            j++;
            k++;
        }

    }
}
