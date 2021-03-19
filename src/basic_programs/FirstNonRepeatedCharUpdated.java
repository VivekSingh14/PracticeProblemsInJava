package basic_programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class FirstNonRepeatedCharUpdated {

    public static void main(String args[]){

        String str = "GeeksforGeeks";
        HashMap<Character, Integer> map = new HashMap<>();
        
        char arr[] = str.toCharArray();

        for(int i = 0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }

        boolean found = false;
        for(Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue().equals(1)){
                System.out.println("First non repeated char: "+ entry.getKey());
                found =true;
            }
        }
        if(!found){
            System.out.println("No non repeating char");
        }
    }
    
}
