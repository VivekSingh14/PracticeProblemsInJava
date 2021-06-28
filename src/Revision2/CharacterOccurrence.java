package Revision2;

public class CharacterOccurrence {
    public static void  main(String args[]){
        String str = "abaabccccffeefbbe";
        char arr[] = str.toCharArray();

        int table1[] = new int[27];
        for(int i=0; i<arr.length;i++  ){
            table1[arr[i]]++;
        }

        
    }
}
