package Strings;

public class StringSplit {
	/*
	 * This method has two variants and splits this string around matches of the given regular expression.
	 */
	public static void main(String[] args) {
		String Str1 = new String("Hello-World-Today");
		String Str2 = new String("Hello World");

		System.out.println("Return Value :" );
		for (String retval: Str1.split("-", 2)){
			System.out.println(retval);
		}
		System.out.println();
		
		System.out.println("Return Value :" );
		for (String retval: Str1.split("-", 3)){
			System.out.println(retval);
		}
		System.out.println();
		
		System.out.println("Return Value :" );
		for (String retval: Str2.split(" ", 0)){
			System.out.println(retval);
		}
		System.out.println();
		
		System.out.println("Return Value :" );
		for (String retval: Str2.split(" ")){
			System.out.println(retval);
		}
	}
}
