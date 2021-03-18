package basic_programs;

public class FirstNonRepeatedChar {
    public static void main(String args[]){
        String str = "GeeksforGeeks";
        final int NO_OF_CHARS = 256;
        char count[] = new char[NO_OF_CHARS];
        for(int i = 0; i<str.length();i++){
            count[str.charAt(i)]++;
        } 

        int index = -1; 
        for(int j = 0; j <str.length(); j++){
            if(count[str.charAt(j)]==1){
                index = j;
                break;
            }
        }
        System.out.println("first non repeated character is: "+str.charAt(index));

    }
}
