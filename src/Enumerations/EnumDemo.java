package Enumerations;

public class EnumDemo {

	public static void main(String[] args) {
		
		Priority priority = Priority.HIGH;
		
		switch(priority) {
		case HIGH:
			System.out.println("HIGH Priority");
		break;
		case MEDUIM:
		System.out.println("MEDIUM preiority");
		break;
		case LOW:
			System.out.println("LOW priority");
			break;
		}
		//HIGH Priority
		
	}

}
