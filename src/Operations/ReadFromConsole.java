package Operations;

import java.util.Scanner;

public class ReadFromConsole {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //Pour �crire dedans, cet objet est obligatoire (System in est connect� avec console
		// d'o� le console va comprendre les entr�s et les sorties
		System.out.println("Entrez un mot SVP : ");
		String word = sc.next(); //pour lire un strint (next)
		System.out.println("Vous avez entr� ce mot : " + word);
		System.out.println("Entrez un nombre entier SVP : ");
		int i = sc.nextInt(); //pour lire un entier (nextInt)
		System.out.println("Vous avez entr�  le nombre entier suivant : " + i);

	}

}
