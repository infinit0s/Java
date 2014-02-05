package Strings;

import java.io.UnsupportedEncodingException;

public class StringGetBytes {
	/*
	 * This method has following two forms:
	 * 
	 * getBytes(String charsetName): Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.
	 * 
	 * getBytes(): Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.
	 */
	public static void main(String[] args) {
		String Str1 = new String("Hello World");

	    try{
	    	byte[] Str2 = Str1.getBytes();
	    	System.out.println("Returned  Value " + Str2 );

	    	Str2 = Str1.getBytes( "UTF-8" );
	    	System.out.println("Returned  Value " + Str2 );

	        Str2 = Str1.getBytes( "ISO-8859-1" );
	        System.out.println("Returned  Value " + Str2 );
	    }catch( UnsupportedEncodingException e){
	    	System.out.println("Unsupported character set");
	    }
	}
}
