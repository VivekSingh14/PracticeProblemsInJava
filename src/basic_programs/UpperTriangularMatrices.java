package basic_programs;

public class UpperTriangularMatrices {
    public static void main(String args[]){
        int arr[][] = {{1,2,3,4}, {0,5,6,7}, {0,0,8,9}};
         int flag = 0;
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(i > j && arr[i][j] != 0){
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println("Given matrices is upper triangular");
        }else{
            System.out.println("Given matrices is not upper triangular");            
        }
    }
}
