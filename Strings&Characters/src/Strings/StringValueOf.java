package Strings;

public class StringValueOf {
	/*
	 * This method has followings variants, which depend on the passed parameters. This method returns the string representation of the passed argument.
	 * valueOf(boolean b): Returns the string representation of the boolean argument.
	 * valueOf(char c): Returns the string representation of the char argument.
	 * valueOf(char[] data): Returns the string representation of the char array argument.
	 * valueOf(char[] data, int offset, int count): Returns the string representation of a specific subarray of the char array argument.
	 * valueOf(double d): Returns the string representation of the double argument.
	 * valueOf(float f): Returns the string representation of the float argument.
	 * valueOf(int i): Returns the string representation of the int argument.
	 * valueOf(long l): Returns the string representation of the long argument.
	 * valueOf(Object obj): Returns the string representation of the Object argument.
	 */
	public static void main(String[] args) {
		double d = 102939939.939;
		boolean b = true;
		long l = 1232874;
		char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };
		
		System.out.println("Return Value : " + String.valueOf(d) );
		System.out.println("Return Value : " + String.valueOf(b) );
		System.out.println("Return Value : " + String.valueOf(l) );
		System.out.println("Return Value : " + String.valueOf(arr) );
	}
}
