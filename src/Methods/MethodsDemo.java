package Methods;

public class MethodsDemo {

	public static void main(String[] args) {
		
		int sum = sum(1,3);
		printToConsole(sum);
		printToConsole(sum(1.2,3.5));
		printToConsole("some texte");
	}

	private static void printToConsole(double d) {
		System.out.println(d);
		
	}

	private static void printToConsole(int i) {
		System.out.println(i);	
	}

	private static void printToConsole(String text) {
		System.out.println(text);
	}

	private static int sum (int i1, int i2) {
		int result = i1 + i2;
		return result;
	}
	
	private static double sum (double d1 , double d2) {
		return d1+d2;
	}
}
