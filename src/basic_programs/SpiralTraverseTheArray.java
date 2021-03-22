package basic_programs;

public class SpiralTraverseTheArray {

    public static void main(String args[]){
        int arr[][] = {{2,4,6,8}, {5,9,12,16}, {2,11,5,9}, {3,2,1,8}};

        int T=0, B= arr.length-1, L=0, R=arr.length-1;
        int dir = 0;
        while(T <= B && L <=R){
            if(dir == 0){
                for(int i =L ; i<=R;i++)
                System.out.print(arr[T][i]+" ");

            T++;
            dir = 1;
            }else if( dir == 1){
                for(int i = T; i<=B;i++)
                System.out.print(arr[i][R]+" ");
                R--;
                dir = 2;
            }else if(dir == 2){
                for(int i=R; i>=L; i--)
                System.out.print(arr[B][i]+" ");
                B--;
                dir = 3;
            }else if(dir == 3){
                for( int i=B; i >=T; i--)
                    System.out.print(arr[i][L]+" ");
                L++;
                dir = 0;
            }
        }

    }
    
}
