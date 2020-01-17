package application;

import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Rent[] vect = new Rent[10];
		
		System.out.print("How many rooms will be rented: ");
		
		int n = sc.nextInt();
		
			sc.nextLine();
		
		for (int i=0; i < n; i++) {
			
			System.out.print("Nome: ");
			
			String nome = sc.nextLine();
			
			System.out.print("E-mail: ");
			
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			
			int room = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			vect[room] = new Rent(nome, email); }
			
			for (int i=0; i<10; i++) {
				
				if (vect[i] != null ) {
		
			System.out.println("Busy Rooms: \n"+ i +": "+ vect[i]);
			
			
			}
		}

	}

}
