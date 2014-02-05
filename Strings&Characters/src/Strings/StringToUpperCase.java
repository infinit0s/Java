package Strings;

import java.util.Locale;

public class StringToUpperCase {

	public static void main(String[] args) {
		String Str = new String("Hello World is SEEN to OFTEN in programming worLD");

	    System.out.print("Return Value :");
	    System.out.println(Str.toUpperCase());
	    
	    Locale cLocale = new Locale.Builder().setLanguage("en").setRegion("GB").build();
	    System.out.println("Return Value :");
	    System.out.println(cLocale.toString().toUpperCase());

	}

}
