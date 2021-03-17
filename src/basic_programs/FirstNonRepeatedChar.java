package basic_programs;

import java.util.HashMap;

public class FirstNonRepeatedChar {
    public static void main(String args[]){
        String str = "GeeksforGeeks";
        HashMap<Character, Integer> map = new HashMap<>();
        for( int i=0; i< str.length(); i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }else{
                int value = map.get(str.charAt(i));
                value++;
                map.put(str.charAt(i), value);
            }
        }
        for(char c: map.keySet()){
            System.out.println(c+ " "+ map.get(c));
        }

    }
}
