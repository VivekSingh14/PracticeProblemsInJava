package OOPConcepts.Collections.ArrayToArrayList;

import java.util.ArrayList;

public class App {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};

        funcusingtraversing(arr);

        funcusingInBuilt(arr);
    }

    private static void funcusingInBuilt(int[] arr) {
        
    }

    private static void funcusingtraversing(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++ ){
            li.add(arr[i]);
        }
        System.out.println(li);
    }
}
