package Strings;

public class StringEndsWith {
	/*
	 * This method tests if this string ends with the specified suffix.
	 */
	public static void main(String[] args) {
		String Str = new String("This is really not immutable!!");
	    boolean retVal;

	    retVal = Str.endsWith( "immutable!!" );
	    System.out.println("Returned Value = " + retVal );

	    retVal = Str.endsWith( "immu" );
	    System.out.println("Returned Value = " + retVal );
	}
}