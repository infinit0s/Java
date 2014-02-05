package Strings;

public class StringLastIndexOf {
	/*
	 * This method has the following variants:
	 * 
	 * int lastIndexOf(int ch): Returns the index within this string of the last occurrence of the specified character or -1 if the character does not occur.
	 * 
	 * public int lastIndexOf(int ch, int fromIndex): Returns the index of the last occurrence of the character in the character sequence 
	 * represented by this object that is less than or equal to fromIndex, or -1 if the character does not occur before that point.
	 * 
	 * public int lastIndexOf(String str): If the string argument occurs one or more times as a substring within this object, 
	 * then it returns the index of the first character of the last such substring is returned. If it does not occur as a substring, -1 is returned.
	 * 
	 * public int lastIndexOf(String str, int fromIndex): Returns the index within this string of the last occurrence of the specified substring, 
	 * searching backward starting at the specified index.
	 */
	public static void main(String[] args) {
		String Str = new String("Hello World is seen to often in programming world!");
		String SubStr1 = new String("world!");
		String SubStr2 = new String("Strings are immutable!");

		// find first occurrence of o
	    System.out.print("Found Index :" );
	    System.out.println(Str.lastIndexOf( 'o' ));
	    // find first occurrence of o after index 5
	    System.out.print("Found Index :" );
	    System.out.println(Str.lastIndexOf( 'o', 5 ));
	    // find first occurrence of SubString1 in Str
	    System.out.print("Found Index :" );
	    System.out.println( Str.lastIndexOf( SubStr1 ));
	    // find first occurrence of SubString1 in Str after index 50
	    System.out.print("Found Index :" );
	    System.out.println( Str.lastIndexOf( SubStr1, 50 ));
	    // find first occurrence of SubString2 in Str
	    System.out.print("Found Index :" );
	    System.out.println(Str.lastIndexOf( SubStr2 ));
	}
}
