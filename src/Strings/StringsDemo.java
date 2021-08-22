package Strings;

public class StringsDemo {

	public static void main(String[] args) {
		
		String s = " hello ";
		 
		System.out.println("s.length() : " + s.length()); //7
		System.out.println("s.contains() : " + s.contains("he")); //true
		System.out.println("s.isempty() : " + s.isEmpty()); //false
		System.out.println("s.ToUpperCase() : " + s.toUpperCase()); //HELLO
		System.out.println("s.startsWith() : " + s.startsWith("h")); //false
		System.out.println("s.endswith : " + s.endsWith(""));
		System.out.println("s.replace ll to  LL : " + s.replace("ll", "LL")); //heLLo
		
		System.out.println("___________________________________________________________________");
		
		String s2 = " hello ";
		
		System.out.println("s == s2 : " + (s == s2) ); //true
		
		String s3 = new String (" hello ");
		
		System.out.println("s == s3 : " + (s == s3) ); //false
		System.out.println("s.equals(s3) : " + s.equals(s3)); //true
		System.out.println("s == s3.intern() : " + (s == s3.intern())); //true
		
		System.out.println("___________________________________________________________________");
		
		String firstName = "Andrii";
		String firstName2 = "andrii";
		
		System.out.println("firstName.equals(firstName2) : " + firstName.equals(firstName2)); //false
		System.out.println("firstName.equalsIgnoreCase(firstName2) : " + firstName.equalsIgnoreCase(firstName2)); //true
		
		System.out.println("Mon livre préféré est \"Coucou\""); //Mon livre préféré est "Coucou"
		System.out.println("Path to the source code : D:\\Java\\sources "); //Path to the source code : D:\Java\sources 
		
		
		System.out.println("Unicode caracter, \u00A9 IT-Bulls.com "); //Unicode caracter, © IT-Bulls.com 
		
		System.out.println("___________________________________________________________________");
		
		String greetingsTemplate ="Hello, dear %s! Good %s! ";
		
		String morning = "Morning";
		String afternoon = "Afternoon";
		String evening = "Evening";
		
		String formatedString = String.format(greetingsTemplate, firstName, morning);	//Hello, dear Andrii! Good Morning! 
		
		System.out.println(formatedString);
		
		System.out.printf("Vous avez %d d'ordinateurs valable dans le store\n",10); //Vous avez 10 d'ordinateurs valable dans le store
	}

}