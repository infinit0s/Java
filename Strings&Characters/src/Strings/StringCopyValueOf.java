package Strings;

public class StringCopyValueOf {
	/*
	 * This method has two different forms:
	 * 
	 * public static String copyValueOf(char[] data): Returns a String that represents the character sequence in the array specified.
     *
     * public static String copyValueOf(char[] data, int offset, int count): Returns a String that represents the character sequence in the array specified.
	 */
	public static void main(String[] args) {
		char[] Str1 = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};
	    String Str2 = "";

	    Str2 = String.copyValueOf( Str1 );
	    System.out.println("Returned String: " + Str2);

	    Str2 = String.copyValueOf( Str1, 2, 6 );
	    System.out.println("Returned String: " + Str2);
	}
}
