package basic_programs;

import java.util.Arrays;

public class AnagramStrings {
 public static void main(String args[]){
     //added hardcoded strings.
     String str1 = "listen";
     String str2 = "silent";

     

     char strchar1[] = str1.toCharArray();
     char strchar2[] = str2.toCharArray();
     Arrays.sort(strchar1);
     Arrays.sort(strchar2);
     boolean flag  = false;
     if(strchar1.length != strchar2.length){
         System.out.println("Not an anagram");
        }else {
            for( int i = 0; i < strchar1.length;i++){
                if(strchar1[i] != strchar2[i]){
                flag = true;
                break;
                }
            }
        }
        if(flag == true){
            System.out.println("Strings are not anagram");
        }else{
            System.out.println("Strings are anagram");
        }
    }   
}
