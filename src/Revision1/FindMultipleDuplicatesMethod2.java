import java.util.HashMap;

public class FindMultipleDuplicatesMethod2 {
    public static void main(String args[]){
        int arr[] = {1,4,3,1,2,5,6,2,7,0,5};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                int value = map.get(arr[i]);
                value++;
                map.put(arr[i], value);
            }
        }

        for (int i : map.keySet()) {
            if(map.get(i) == 2){
                System.out.println(i);
            }
        }
    }
}
