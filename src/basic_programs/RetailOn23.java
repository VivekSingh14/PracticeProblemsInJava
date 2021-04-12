package basic_programs;

import java.util.HashMap;

public class RetailOn23 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,5,5,6,7,7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                int count = map.get(arr[i]);
                count++;
                map.put(arr[i], count);
            }
        }

        for (int i : map.keySet()) {
            if(map.get(i) > 1){
                System.out.println(i+" is repeated "+map.get(i)+" times.");
            }
            
        }
    }
}
