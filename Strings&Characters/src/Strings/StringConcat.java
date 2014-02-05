package Strings;

public class StringConcat {
	/*
	 * This method appends one String to the end of another. The method returns a String with the value of the String 
	 * passed in to the method appended to the end of the String used to invoke this method.
	 */
	public static void main(String[] args) {
		String s = "Strings are immutable";
	    s = s.concat(" all the time");
	    System.out.println(s);
	}
}
