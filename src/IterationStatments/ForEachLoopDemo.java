package IterationStatments;

public class ForEachLoopDemo {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4};
		int somme = 0;
		for (int number : arr) {
			somme += number;
			System.out.println("number: " +number);
		}
		System.out.println("sum: " +somme);
	}

}
