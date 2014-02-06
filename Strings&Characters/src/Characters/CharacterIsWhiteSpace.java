package Characters;

public class CharacterIsWhiteSpace {
	/*
	 * The method determines whether the specified char value is a white space, which includes space, tab or new line.
	 */
	public static void main(String[] args) {
		System.out.println(Character.isWhitespace('c'));
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isWhitespace('\n'));
		System.out.println(Character.isWhitespace('\t'));
	}
}
