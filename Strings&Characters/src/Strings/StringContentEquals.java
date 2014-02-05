package Strings;

public class StringContentEquals {
	/*
	 * This method returns true if and only if this String represents the same sequence of characters as the specified in StringBuffer.
	 */
	public static void main(String[] args) {
		String str1 = "Not immutable";
	    String str2 = "Strings are immutable";
	    StringBuffer str3 = new StringBuffer( "Not immutable");

	    boolean  result = str1.contentEquals( str3 );
	    System.out.println(result);
		  
	    result = str2.contentEquals( str3 );
	    System.out.println(result);
	}
}
