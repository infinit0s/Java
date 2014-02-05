package Strings;

public class StringMatches {
	/*
	 * This method tells whether or not this string matches the given regular expression. 
	 * An invocation of this method of the form str.matches(regex) yields exactly the same result as the expression Pattern.matches(regex, str).
	 */
	public static void main(String[] args) {
		String Str = new String("Hello World is seen to often in programming world!");

		System.out.print("Return Value :" );
		System.out.println(Str.matches("(.*)program(.*)"));

		System.out.print("Return Value :" );
		System.out.println(Str.matches("world"));
	    
		System.out.print("Return Value :" );
		System.out.println(Str.matches("Welcome(.*)"));
	}
}
