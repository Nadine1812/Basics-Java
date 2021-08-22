package ClassEtObject;

public class voitures {

	public String couleur;
	public String marque;
	
	public voitures (String cl, String mq) {
		this.couleur=cl;
		this.marque=mq;
	}
	public static void main(String[] args) {
		
		voitures maVoiture = new voitures ("Blanche", "Fiat");
		System.out.println("La couleur de ma voiture est : " +maVoiture.couleur+ " , et sa marque est : " +maVoiture.marque);
	}

}
