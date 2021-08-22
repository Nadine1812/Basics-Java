package ControlStatements;

public class IfElseDemo {

	public static void main(String[] args) {
		
		//exemple1
		
		int amountOfMoneyOnAccount = 100;
		int itemPrice = 200;
		
		if (amountOfMoneyOnAccount < itemPrice ) {
			System.out.println("You d'ont have enough money on your account to purchase " + "this item");
		} else {
			System.out.println("itecm is purchased");
		}
		
		//exemple2
		
		int i1 = 3;
		int i2 = 2;
		int i3 = 10;
		
		if (i1 > i2)
			if (i1 > i3)
				System.out.println("i1 is more than i2 and i3");
			else 
				System.out.println("i1 is more than i2 but less than i3");
		
		//exemple3
		
		int orderPrice = 1000;
		
		if(orderPrice > 0 && orderPrice < 100) {
			System.out.println("Vous avez une remise de 5%.");
		} else if (orderPrice >= 100 && orderPrice < 500) {
			System.out.println("Vous avez un remise de 10%");
		} else if (orderPrice >= 500 && orderPrice < 5000) {
			System.out.println("Vous avez un remise de 15%");
		}

	}

}
