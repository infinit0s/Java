package Strings;

import java.util.Locale;

public class StringToLowerCase {
	/*
	 * This method has two variants. First variant converts all of the characters in this String to lower case 
	 * using the rules of the given Locale. This is equivalent to calling toLowerCase(Locale.getDefault()).
	 * Second variant takes locale as an argument to be used while converting into lower case.
	 */
	public static void main(String[] args) {
		String Str = new String("Hello World is SEEN to OFTEN in programming worLD");

	    System.out.print("Return Value :");
	    System.out.println(Str.toLowerCase());
	    
	    Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("GB").build();
	    System.out.println("Return Value :");
	    System.out.println(cLocale.toString().toLowerCase());
	}
}
