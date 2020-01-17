package br.com.vectores_fixacao;

import java.util.Scanner;

public class ProgramAluguel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		
		int n = sc.nextInt();

		Estudantes[] vect = new Estudantes[10];
		
		for(int i=1; i <= n; i++) {
			
			System.out.println("Rent #"+i +":"); 
		
			System.out.print("Nome: ");
			
			String nome = sc.next();
			
			System.out.print("E--mail: ");
			
			String email = sc.next();
			
			System.out.print("Room: ");
			
			int room = sc.nextInt();
			
			vect[room] = new Estudantes(nome, email); }
			
			System.out.println("Busy rooms:"); 
			
			for (int i=0; i < 10; i++) {
		
			//	if (vect[i] != null) {
				
					System.out.println(i+ ": "+vect[i].toString()); 
					
			//	}
			
			}
		
			
			
		
	}

}
