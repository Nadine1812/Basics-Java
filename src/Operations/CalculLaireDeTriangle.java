package Operations;

import java.util.Scanner;

public class CalculLaireDeTriangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez l'hauteur du triangle : ");
		int i = sc.nextInt();
		System.out.println("Entrer le largeur du triangle : ");
		int i2 = sc.nextInt();
		System.out.println("L'air du triangle est égale à : " + ( i * i2) / 2);

	}

}
