package Strings;

public class StringReplaceFirst {
	/*
	 * This method replaces the first substring of this string that matches the given regular expression with the given replacement.
	 */
	public static void main(String[] args) {
		String Str = new String("Hello World is seen to often in programming world!");

		System.out.print("Return Value :" );
		System.out.println(Str.replaceFirst("World(.*)","...And another Hello World" ));

		System.out.print("Return Value :" );
		System.out.println(Str.replaceFirst("World is seen to often in programming world!", "World" ));
	}
}
