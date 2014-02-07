package Mathematical;

public class FibonacciSequence_v1 {

	public static void main(String[] args) {
		FibonacciSequence_v1 fibi = new FibonacciSequence_v1();
		System.out.println(fibi.getIndex(10));
	}
	public int getIndex(int index){     
        double first = Math.pow((( 1 + Math.sqrt(5)) / 2), index);
        double second = Math.pow(((1 - Math.sqrt(5)) / 2), index);
        
        return (int) Math.floor((first - second) / Math.sqrt(5));       
    }
}
