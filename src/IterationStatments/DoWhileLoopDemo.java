package IterationStatments;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
		int counter = 0 ;
		
		do { 
			System.out.println("counter : " +counter++);
		} while (counter < 5);
		
		do {
			System.out.println("counter is five already: " +counter);
		}  while (counter < 5);

	}

}
