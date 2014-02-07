package ReverseString;

public class ReverseString_v2 {
	private static String word = "Hello World";
	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder(word);
		System.out.println(sb.reverse());
	}
}
