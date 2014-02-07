package DecisionMaking;

public class SwitchCase {
	/*
	 * A switch statement allows a variable to be tested for equality against a list of values. 
	 * Each value is called a case, and the variable being switched on is checked for each case.
	 */
	public static void main(String[] args) {
		String grade = "C";
		
		switch(grade){
			case "A":
				System.out.println("Congratulations you have achieved grade A");
				break;
			case "B":
				System.out.println("Not bad you got grade B");
				break;
			case "C":
				System.out.println("Average grade - C");
				break;
			case "D":
				System.out.println("Time to start learning!");
				break;
			case "F":
				System.out.println("FAIL!");
				break;
			default:
				System.out.println("Invalid Grade");
				break;
		}
	}

}
