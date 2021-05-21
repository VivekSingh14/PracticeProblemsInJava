package Revision1;

public class DupicateCharacterInString {
    public static void main(String args[]){
        int arr[] = new int[26];
        String str = "abcdab";

        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-97]+=1;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i] > 1){
                int temp = 97+i;
                System.out.print((char)temp+" ");
            }
        }
        System.out.println();
    }
}
