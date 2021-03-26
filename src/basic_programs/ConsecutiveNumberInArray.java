package basic_programs;

public class ConsecutiveNumberInArray {
    public static void main(String args[]){
        int arr[] = {5,2,3,1,4};
        int actualSum = 0;
        //sorting it using bubble sort
        for(int i =0; i<arr.length-1;i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //
        for(int i =0; i<arr.length;i++){
            actualSum = actualSum+arr[i];
        }
        
        int expectedsum = (arr.length * (arr[0] + arr[arr.length-1])) / 2;

        if(expectedsum == actualSum){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
