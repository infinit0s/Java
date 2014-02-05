package Strings;

public class StringSubSequence {
	/*
	 * This method returns a new character sequence that is a subsequence of this sequence.
	 */
	public static void main(String[] args) {
		String Str = new String("Hello World is seen to often in programming world!");

	    System.out.print("Return Value :" );
	    System.out.println(Str.subSequence(0, 11) );
	    
	    System.out.print("Return Value :" );
	    System.out.println(Str.subSequence(32, 44) );
	}
}
