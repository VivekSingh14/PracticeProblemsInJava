package basic_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterWithOccurence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        
        char arr[] = str.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                int val = map.get(arr[i]);
                val++;
                map.put(arr[i], val);
            }
        }

        for (char c : map.keySet()) {
           System.out.print(c +""+map.get(c)); 
        }
        System.out.println();
        sc.close();
        
    }
}
