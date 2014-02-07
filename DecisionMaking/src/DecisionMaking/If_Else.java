package DecisionMaking;

public class If_Else {

	public static void main(String[] args) {
		for(int i=0; i<10; i++){
			if(i==2 || i==4){
				System.out.println("Now i = " + i);
			}else{
				System.out.println("Value of i : " + i);
			}
		}
		
		for(int i=10; i>=0; i--){
			if(i!=0){
				System.out.println("i is NOT equal to 0, value of i : " + i);
			}else{
				System.out.println("i is now 0");
			}
		}
		
		String fname = "Maciej";
		String sname = "Cygan";
		
		if(fname.equals("Megan")){
			//
		}
		else if(fname.equals("Maciej")){
			if(sname.equals("Foo")){
				//
			}
			else if(sname.equals("Cygan")){
				System.out.println("Person correctly identified");
			}
		}else{
			//
		}
	}
}
