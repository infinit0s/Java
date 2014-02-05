package Strings;

public class StringRegionMatches {
	/*
	 * This method has two variants which can be used to test if two string regions are equal.
	 */
	public static void main(String[] args) {
		String Str1 = new String("Hello World is seen to often in programming world!");
		String Str2 = new String("World");
		String Str3 = new String("PROGRAMMING");

		System.out.print("Return Value :" );
		System.out.println(Str1.regionMatches(6, Str2, 0, 5));

		System.out.print("Return Value :" );
		System.out.println(Str1.regionMatches(11, Str3, 0, 9));

		System.out.print("Return Value :" );
		System.out.println(Str1.regionMatches(true, 32, Str3, 0, 11));
	}
}
