package OOPConcepts.Collections.ArrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};

        funcusingtraversing(arr);

        Integer arr1[] = {Integer.valueOf(1), 
                         Integer.valueOf(2),
                         new Integer(3),
                         new Integer(4)};

        funcusingInBuilt(arr1);
    }

    private static void funcusingInBuilt(Integer[] arr) {
        ArrayList<Integer> li1 = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println(li1);
    }

    private static void funcusingtraversing(int[] arr) {
        ArrayList<Integer> li = new ArrayList<>();
        for(int i=0;i<arr.length;i++ ){
            li.add(arr[i]);
        }
        System.out.println(li);
    }
}
