package Strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	//Pattern matching
	public static void main(String[] args) {
		
		System.out.println("Exemple1");
		
		String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com";
		Pattern p = Pattern.compile(gmailPattern);
		String simpleText = "text qui contient un adresse email" + "comme ceci. nadine-email@gmail.com, et un peu d'autre text.";
		
		Matcher m = p.matcher(simpleText); //matcher fait le matcher (tatabo9) entre les deux expréssions qui analyse la séquence en entrée
		
		m.find();
		
		String gmailAdress = m.group();
		System.out.println(gmailAdress); // nadine-email@gmail.com
		
		System.out.println("Exemple2");
		
		String simpleText2 = "Il y a trois phrases dans ce String, etes-vous sur? Yes!";
		String[] phrases = simpleText2.split("[\\.!?]");
		System.out.println(Arrays.toString(phrases)); //[Il y a trois phrases dans ce String, etes-vous sur,  Yes]

	}

}
