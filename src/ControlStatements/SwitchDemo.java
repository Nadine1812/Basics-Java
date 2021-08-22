package ControlStatements;

public class SwitchDemo {

	public static void main(String[] args) {
		
		//exemple1
		
		String customerStatus = "premium_customer";
		switch (customerStatus) {
		case "guest":
			System.out.println("Thank you for your order");
			break;
		case "regular_customer":
			System.out.println("Thank your for your porchase! take discount 10% for your order as a gratitude for staying with us. ");
			break;
		case "premium_customer":
			System.out.println("Wow! You are our premium customer! Just take all order for 1$");
			break;
			default:
				System.out.println("Customer dosen't have status set. ");
		}
		
		//exemple2
		
		int i = 1;
		switch (i) {
		case 1:
			System.out.println("one");
		case 2:
		System.out.println("two");
		case 3:
			System.out.println("three");
			break;
			default:
			System.out.println("this is default block");
		}
		
		//exemple3
		
		i = 10;
		switch (i) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		default:
			System.out.println("this is default block");
		}
	}

}
