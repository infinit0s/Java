package Strings;

public class StringsGetChars {
	/*
	 * This method copies characters from this string into the destination character array.
	 */
	public static void main(String[] args) {
		String Str1 = new String("Hello World is seen to often in programming world!");
	    char[] Str2 = new char[10];

	    try{
	    	Str1.getChars(2, 12, Str2, 0);
	    	System.out.print("Copied Value = " );
	    	System.out.println(Str2 );
	    }catch( Exception ex){
	    	System.out.println("Raised exception...");
	    }
	}
}
