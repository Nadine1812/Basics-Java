package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class SplitWords {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrerz ce que vous voulez: ");
		String userInput = sc.nextLine();
		System.out.println("Vous avez entrer ces mots : ");
		System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+")));

	}

}
