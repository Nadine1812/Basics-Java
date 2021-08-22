package Operations;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Pour écrire dedans, cet objet est obligatoire (System in est connecté avec console
		// d'où le console va comprendre les entrés et les sorties
		System.out.println("Entrez un mot SVP : ");
		String word = sc.next(); //pour lire un strint (next)
		System.out.println("Vous avez entré ce mot : " + word);
		System.out.println("Entrez un nombre entier SVP : ");
		int i = sc.nextInt(); //pour lire un entier (nextInt)
		System.out.println("Vous avez entré  le nombre entier suivant : " + i);

	}

}
