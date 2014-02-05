package Strings;

public class StringCompareTo {
	/*
	 * There are two variants of this method. First method compares this String to another Object and second method compares two strings lexicographically
	 */
	public static void main(String[] args) {		
		String str1 = "Strings are immutable";
		String str2 = "Strings are immutable";
	    String str3 = "Integers are not immutable";

	    int result = str1.compareTo( str2 );
	    System.out.println(result);
		  
	    result = str2.compareTo( str3 );
	    System.out.println(result);
		 
	    result = str3.compareTo( str1 );
	    System.out.println(result);
	}
}
