package basic_programs;

import java.util.HashMap;

public class DuplicateCharactersfromString {
    public static void main(String args[]){
        //Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        String str = "aabcadceklmeb";

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < str.length();i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            }else{
                int value = map.get(str.charAt(i));
                value++;
                map.put(str.charAt(i), value);
            }
        }

        for( char c : map.keySet()){
            if(map.get(c) == 2){
                System.out.println(c);
            }
        }
    
    }
}
