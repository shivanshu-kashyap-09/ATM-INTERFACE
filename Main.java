package atmInterface;

import java.util.Scanner;

public class Main { 
	
	public static int balance = 1000;
	
	public static void checkBalance() {
		System.out.println("\n\n balance amount : "+balance+"\n\n");
	}
	
	public static void withdrawAmount(int amount) {
		balance -= amount;
		System.out.println("\n\n withdraw amount : "+amount);
		System.out.println(" balance amount : "+balance+"\n\n");
	}
	
	public static void depositeAmount(int amount) {
		balance += amount;
		System.out.println("\n\n Deposite amount : "+amount);
		System.out.println(" balance amount : "+balance+"\n\n");
		
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int correctPin = 2212;
		
		for(int i = 0 ; i < 3 ; i++) {
			
			System.out.print("Enter PIN : ");
			int pin = scan.nextInt();
			
			if(pin == correctPin) {
				
				do {
				System.out.println("Check Balance : press 1");
				System.out.println("Withdraw amount : press 2");
				System.out.println("Deposite amount : press 3");
				System.out.println("Exit : press 4");
				System.out.print("Enter your choice : ");
				int choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					checkBalance();
					break;
					
				case 2:
					System.out.print("Enter withdraw amount : ");
					int amount = scan.nextInt();
					withdrawAmount(amount);
					break;
					
				case 3:
					System.out.print("enter the deposite amount : ");
					amount = scan.nextInt();
					depositeAmount(amount);
					break;
					
				case 4:
					System.exit(0);
					
					default:
						System.out.println("Invalid option");
				}
				
			}while(true);
				
		  }else {
				System.out.println("Invalid PIN");
			}
		}

	}

}
