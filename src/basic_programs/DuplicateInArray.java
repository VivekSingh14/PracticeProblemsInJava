package basic_programs;

public class DuplicateInArray {
    public static void main(String args[]){
        //revised one time
        int arr[] = {8,2,3,8,5,3,6,2};
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(i != j && j > i && arr[i] == arr[j]){
                    System.out.print(arr[j]+ " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
