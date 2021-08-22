package IterationStatments;

public class JumpStatementDemo {

	public static void main(String[] args) {
		
		//exemple1 : Continue
		
		for (int i = 0 ; i < 5 ; i++) {
			if (1 % 2 == 0 ) 
				continue;
			System.out.println(i); 
		}
	
	//exemple2 :  Break
		
	for ( int i = 0 ;  i < 5 ; i++) {
			if ( i == 3)
				break;
			System.out.print("Counter = " +i);
	}
}
}
		
