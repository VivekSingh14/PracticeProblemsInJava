package basic_programs;

public class MatricesSum {
    public static void main(String args[]){
        int mat1[][] = {{1,2}, {3,4}};
        int mat2[][] = {{3,4}, {1,2}};
        int result[][] = new int[2][2];

        for(int i = 0; i< mat1.length;i++ ){
            for(int j = 0; j < mat1[i].length;j++){
                result[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        for(int i =0 ; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
