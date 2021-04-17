package basic_programs;

public class DuplicatesRemoval {
    public static void main(String args[]){
        //revised one time
        int arr[] = {1,2,3,3,4,4,4,5,6,7,7,7,8};
        int j=0;
        for(int i = 1; i < arr.length;i++ ){
            if(arr[i] != arr[j]){
                arr[++j] = arr[i];
            }
        }
        int newLength = ++j;
        for(int k = 0; k<newLength;k++ ){
            System.out.print(arr[k]+ " ");
        }
        System.out.println();
    }
}
