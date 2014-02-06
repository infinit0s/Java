package reverseString;

public class ReverseString {
	private String word = "Hello World";
	private String newWord = "";
	public static void main(String[] args) {			
		ReverseString rev = new ReverseString();		
		System.out.println(rev.reverseString());
	}
	// Reverse the String
	private String reverseString(){		
		int wordLength = word.length();
		for(int i=0; i < wordLength; i++){	
			newWord = newWord.concat(getLastChar(word));
			this.word = removeLastChar(word);
			setNewWord(newWord);
		}		
		return getNewWord();
	}
	// Get last character in the String
	private String getLastChar(String word){
		return word.substring(word.length()-1);
	}
	// Remove last character from the current String
	private String removeLastChar(String word){
		return word.substring(0, word.length()-1);
	}
	// Set newWord
	public void setNewWord(String word){
		this.newWord = word;
	}
	// Get newWord
	public String getNewWord(){
		return this.newWord;
	}
}
