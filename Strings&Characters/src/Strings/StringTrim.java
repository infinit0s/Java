package Strings;

public class StringTrim {
	/*
	 * This method returns a copy of the string, with leading and trailing whitespace omitted
	 */
	public static void main(String[] args) {
		String Str = new String("   Hello World   ");

		// Removed Trailing and Leading 
		System.out.print("Return Value :" );
		System.out.println(Str.trim() );
	}
}
