package Strings;

public class StringStartsWith {
	/*
	 * This method has two variants and tests if a string starts with the specified prefix beginning a specified index or by default at the beginning.
	 */
	public static void main(String[] args) {
		String Str = new String("Hello World is seen to often in programming world");

		System.out.print("Return Value :" );
		System.out.println(Str.startsWith("Hello") );

		System.out.print("Return Value :" );
		System.out.println(Str.startsWith("often") );

		System.out.print("Return Value :" );
		System.out.println(Str.startsWith("programming", 32) );
	}
}
