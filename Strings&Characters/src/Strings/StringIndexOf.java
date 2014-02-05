package Strings;

public class StringIndexOf {
	/*
	 * This method has following different variants:
	 * 
	 * public int indexOf(int ch): Returns the index within this string of the first occurrence of the specified character 
	 * or -1 if the character does not occur.
	 * 
	 * public int indexOf(int ch, int fromIndex): Returns the index within this string of the first occurrence of the specified character, 
	 * starting the search at the specified index or -1 if the character does not occur.
	 * 
     * int indexOf(String str): Returns the index within this string of the first occurrence of the specified substring. 
     * If it does not occur as a substring, -1 is returned.
     * 
     * int indexOf(String str, int fromIndex): Returns the index within this string of the first occurrence of the specified substring, 
     * starting at the specified index. If it does not occur, -1 is returned.
	 */
	public static void main(String[] args) {
		String Str = new String("Hello World is seen to often in programming world!");
		String SubStr1 = new String("world!");
		String SubStr2 = new String("Strings are immutable!");

		// find first occurrence of o
	    System.out.print("Found Index :" );
	    System.out.println(Str.indexOf( 'o' ));
	    // find first occurrence of o after index 5
	    System.out.print("Found Index :" );
	    System.out.println(Str.indexOf( 'o', 5 ));
	    // find first occurrence of SubString1 in Str
	    System.out.print("Found Index :" );
	    System.out.println( Str.indexOf( SubStr1 ));
	    // find first occurrence of SubString1 in Str after index 50
	    System.out.print("Found Index :" );
	    System.out.println( Str.indexOf( SubStr1, 50 ));
	    // find first occurrence of SubString2 in Str
	    System.out.print("Found Index :" );
	    System.out.println(Str.indexOf( SubStr2 ));
	}
}
