package Mathematical;

public class FibonacciSequence {	
	private int fibNo;
	
	public static void main(String[] args) {
		FibonacciSequence fb = new FibonacciSequence();	
		fb.setIndex(10);
		fb.FibonacciNumber();		
	}
	public void FibonacciNumber(){		
		double Phi = (1+Math.sqrt(5))/2;

		double idx = getIndex();
		double nFib = (Math.pow(Phi, idx) - Math.pow(-1, idx)/Math.pow(Phi, idx)) / Math.sqrt(5);
			
		System.out.println("The " + idx + "th number in Fibonacci Sequence is: " + (int)nFib);
	}
	public void setIndex(int no){
		this.fibNo = no;
	}
	public int getIndex(){
		return this.fibNo;
	}
}
