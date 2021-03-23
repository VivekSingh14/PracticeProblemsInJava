package basic_programs;

public class DiagonalOfSquareMatrices {
    public static void main(String args[]){

        int arr[][] = {{2,4,6,8}, {5,9,12,16}, {2,11,5,9}, {3,2,1,8}};

        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                System.out.print(" ");
                if(i == j){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
        int j = arr.length-1;
        for(int i = 0; i < arr.length; i++){
            for(int k=0; k < arr.length-i;k++){
                System.out.print(" ");
            }
            System.out.print(arr[i][j]+" ");
            j--;
            System.out.println();
        }
    }
}
