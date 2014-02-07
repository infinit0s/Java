package StringSplitter;

public class StringSplitter {

	public static void main(String[] args) {
		String wordCombination = "Hello my name is Maciej and i live in London";
		
		for(String separateWord : wordCombination.split(" ")){
			System.out.println(separateWord);
		}
	}
}
