package Strings;

public class StringReplace {
	/*
	 * This method returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.
	 */
	public static void main(String[] args) {
		String Str = new String("Hello Forld is seen to often in lrogramming world!");
		
		System.out.print("Return Value :" );
		System.out.println(Str.replace('F', 'W'));

		System.out.print("Return Value :" );
		System.out.println(Str.replace('l', 'p'));
	}
}
