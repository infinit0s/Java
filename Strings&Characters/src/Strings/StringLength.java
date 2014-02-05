package Strings;

public class StringLength {
	/*
	 * This method returns the length of this string. The length is equal to the number of 16-bit Unicode characters in the string.
	 */
	public static void main(String[] args) {
		String Str1 = new String("Hello World");
		String Str2 = new String("Hello World is seen to often in programming world!" );

		System.out.print("String Length :" );
		System.out.println(Str1.length());
		
		System.out.print("String Length :" );
		System.out.println(Str2.length());
	}
}
