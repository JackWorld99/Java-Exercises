package emailApp;
import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternativeEmail;
	private String companySuffix = "company.com";
	
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		this.department = setDepartment();
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("\nGenerate password: " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		System.out.println("Generate email: " + email);
	}
	
	private String setDepartment() {
		System.out.print("\nDepartment code: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "sales.";}
		else if (depChoice == 2) {return "development.";}
		else if (depChoice == 3) {return "acounting.";}
		else {return "";}
	}
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++){
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternativeEmail(String altEmail) {
		this.alternativeEmail = altEmail;
	}

	public void changePassword(String password) {
		this.password = password;
	}
	
	public String getName() {return firstName + " " + lastName;}
	public String getEmail() {return email;}
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternativeEmail() {return alternativeEmail;}
	public String getPassword() {return password;}
}
