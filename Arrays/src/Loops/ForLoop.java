package Loops;
import java.util.ArrayList;


public class ForLoop {
	/*
	 * A for loop is a repetition control structure that allows you to efficiently write a loop that needs to execute a specific number of times.
	 * A for loop is useful when you know how many times a task is to be repeated
	 */
	public static void main(String[] args) {
		System.out.println("Printing only even numbers (multiples of two)");
		for(int i=0; i<=20; i++){			
			System.out.println(i++);
		}
		System.out.println("Printing all number from 0 to 20");
		for(int i=0; i<=20; i++){			
			System.out.println(i);
		}
		System.out.println("Print each word in the array on separate line");	
		
		ArrayList<String> array = new ArrayList<String>();
		array.add("one");
		array.add("two");
		array.add("three");		
		
		for(String word : array){
			System.out.println(word);
		}		
		System.out.println();
		
		int [] numbers = {10, 20, 30, 40, 50};

	    for(int x : numbers ){
	    	System.out.print( x );
	        System.out.print(",");
	    }
	    System.out.print("\n");
	    String [] names ={"James", "Larry", "Tom", "Lacy"};
	    
	    for( String name : names ) {
	    	System.out.print( name );
	    	System.out.print(",");
	    }
	    
	    System.out.println();
	    
	    for(int i=0; i<10; i++){
	    	if(i == 5){
	    		break;
	    	}
	    	System.out.println(i);
	    }
	    
	    System.out.println();
	    
	    for(int i=0; i<10; i++){
	    	if(i == 5){
	    		continue;
	    	}
	    	System.out.println(i);
	    }
	}
}
