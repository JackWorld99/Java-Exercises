package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("New worker \nFirst name: ");
		String firstName = in.next();
		
		System.out.print("Last name: ");
		String lastName = in.next();
		
		Email eml = new Email(firstName, lastName);
		
		System.out.print("Enter alternative email: ");
		eml.setAlternativeEmail(in.next());
		
		System.out.print("Enter mailbox Capacity: ");
		eml.setMailboxCapacity(in.nextInt());
		
		System.out.print("Change password? (Y/N): ");
		String decision = in.next();
		if(decision.equals("y") || decision.equals("Y") || decision.equals("yes")) {
			System.out.print("Enter new password: ");
			eml.changePassword(in.next());
		}

		System.out.println("\n~ Worker Info ~");
		String showInfo = "Name: " + eml.getName() +
		"\nCompany Email: " + eml.getEmail() + 
		"\nMailbox Capacity: " + eml.getMailboxCapacity() + "MB";
		System.out.println(showInfo);
	}

}
