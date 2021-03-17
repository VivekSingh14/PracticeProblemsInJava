package basic_programs;

public class CountVowelsInStrings {
    public static void main(String args[]){
        String str = "VivekSingh";
        int countVowels = 0;
        int countConsonents = 0;
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' || 
               str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
               str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
               str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
               str.charAt(i) == 'u' || str.charAt(i) == 'U'){
                countVowels++;
            }else{
                countConsonents++;
            }
        }
        System.out.println("total vowels are: "+ countVowels+ " and consonents: "+countConsonents);
    }
}
