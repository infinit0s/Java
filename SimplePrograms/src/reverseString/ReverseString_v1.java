package ReverseString;

public class ReverseString_v1 {
	private String newWord = "";
	
	public static void main(String[] args) {
		String word = "Hello World";
		
		ReverseString_v1 rev = new ReverseString_v1();
		System.out.println(rev.reverseString(word));
	}
	// Reverse String
	public String reverseString(String word){
		for(int i = word.length()-1; i >= 0; i--){
			newWord = newWord + word.charAt(i);
			setWord(newWord);
		}
		return getWord();
	}
	// Set new Word
	public void setWord(String word){
		this.newWord = word;
	}
	// Get new Word
	public String getWord(){
		return this.newWord;
	}

}
