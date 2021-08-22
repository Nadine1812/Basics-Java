package ControlStatements;

public class AdminGuestMode {

	public static void main(String[] args) {
		
		String InputArguments = String.join(",", args);
		String adminFlag = "--admin";
		String guestFlag = "--guest";
		
		if (InputArguments.contains(adminFlag) && InputArguments.contains(guestFlag)) {
			System.out.println("Choisissez svp 'ADMIN' mode ou" + "'GUEST' mode pour ce programme");
		} else if (InputArguments.contains(adminFlag)) {
			System.out.println("Bonjour Admin");
		} else if (InputArguments.contains(guestFlag)) {
			System.out.println("Bonjour visiteur");
		}
	}
}
