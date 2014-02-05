package Strings;

public class StringIntern {
	/*
	 * This method returns a canonical representation for the string object. 
	 * It follows that for any two strings s and t, s.intern() == t.intern() is true if and only if s.equals(t) is true.
	 */
	public static void main(String[] args) {
		String Str1 = new String("Hello World is seen to often in programming world!");
	    String Str2 = new String("Hello World is seen so often in world");

	    System.out.print("Canonical representation:" );
	    System.out.println(Str1.intern());

	    System.out.print("Canonical representation:" );
	    System.out.println(Str2.intern());	    
	}
}
