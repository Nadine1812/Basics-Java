package Math;

public class Mathclass {

	public static void main(String[] args) {
		System.out.println(Math.PI); //3.14
		System.out.println(Math.max(3, 5)); //5
		System.out.println(Math.min(3, 5)); //3
		System.out.println(Math.sqrt(4)); //2
		System.out.println(Math.sqrt(-1)); //NaN
		System.out.println(Math.abs(-12)); //12
		
		System.out.println(5 / 0.0); // Infinity
		System.out.println(-5 / 0.0); // -Infinity
		
		System.out.println(Math.round(20.0 / 3.0)); //7
		System.out.println(Math.round((20.0 * 100.0 / 3.0)) / 100.0); //6.67
		
		System.out.println(Math.random()); // Nombre aléatoire entre 0.0 et 1.0 
		System.out.println((int)(Math.random()*100)); // Nombre aléatoire entre 0 et 100
		System.out.println((int)(Math.random()*100)  + 100); // Nombre aléatoire entre 100 et 200
	}
}
