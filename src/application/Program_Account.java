package application;

import java.util.Scanner;

import entities.Account;

public class Program_Account {

	public static void main(String[] args) {
				
				Scanner sc = new Scanner (System.in);
				
				Account ac;
				
			System.out.println("Enter account number: ");
			
			int number = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Enter account holder: ");
			
			String name = sc.nextLine();
			
			System.out.println("Is there na initial deposit (y/n)?");
			
			char ideposit = sc.next().charAt(0);
			
			if (ideposit == 'y') {
			
				System.out.println("Enter initial deposit value: ");
				
				double initialDeposit = sc.nextDouble();
		
				ac = new Account(number, name, initialDeposit); 
		
				 }
				
				else {
					
				ac = new Account(number, name); 
				
				}
			
			System.out.println("Account data:" );
			System.out.println();
			System.out.println(ac);	
			System.out.println();
			
			System.out.print("Enter a deposit value:");	
			
			double amount = sc.nextDouble();
			
			ac.deposit(amount);
			
			System.out.println("Updated account data: ");
			System.out.println(ac);
			
System.out.print("Enter a withdraw value:");	
			
			amount = sc.nextDouble();
			
			ac.withdraw(amount);
			
			System.out.println("Updated account data: ");
			System.out.println(ac);
			
			}

	}

