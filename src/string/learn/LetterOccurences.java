package string.learn;

//import java.util.Arrays;

public class LetterOccurences {
	private String str = null;

	public LetterOccurences(String str) {
		this.str = str;
	}

	public void letterOccur() {
		char arr[] = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		try{
		for(int i=0; i< str.length(); i++){
			for(int j = i+1; j < str.length(); j++){
				if(arr[i] > arr[j]){
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		}catch (Exception e){
			System.out.println("Array fails while sorting");
		}
		
		for (int i = 0; i < str.length(); i++) {
			System.out.print(arr[i]);
		}
		
		char temp[] = new char[26];
		int inc = 0;
		for(int i=0; i<str.length();i++){
					for(int j = i+1; j < str.length(); j++){
						if(arr[j] == arr[i]){
							for(int k = j; k < str.length()-1; k++){
								//System.out.println(" "+ arr[k]+ " "+ k+ " " + arr[k+1]+ " ");
								arr[k] = arr[k+1];
							}
						}
					}
			
		}
		System.out.println();
		for (int i = 0; i < str.length(); i++) {
			System.out.print(arr[i]);
		}
		
	}

}
