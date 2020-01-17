import java.util.Scanner;

public class EstruturaCondicional_Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Código: ");
		int Codigo = sc.nextInt();
		
		System.out.print("Quantidade: ");
		int Quantidade = sc.nextInt();
		
	if (Codigo == 1 && Quantidade > 0 ) {
		double Preco = 4.00;
		double Valor = Preco*Quantidade;
		
		System.out.println("Especificação:Cachorro quente: R$ 4.00 reais unidade");
		System.out.printf("Valor Total: %.2f%n",Valor);	
	} 
	else {
	if (Codigo == 2 && Quantidade > 0 ) {
		
		double Preco = 4.50;
		double Valor = Preco*Quantidade;
	
	System.out.println("Especificação:X-Salada: R$ 4.50 reais unidade");
	System.out.printf("Valor Total: %.2f%n",Valor);	}
	
	else {
		
		if (Codigo == 3 && Quantidade > 0 ) {
			
			double Preco = 5.00;
			double Valor = Preco*Quantidade;
		
		System.out.println("Especificação:X-Bacon: R$ 5.00 reais unidade");
		System.out.printf("Valor Total: %.2f%n",Valor);	}
		
		else {
			
			if (Codigo == 4 && Quantidade > 0 ) {
				
				double Preco = 2.00;
				double Valor = Preco*Quantidade;
			
			System.out.println("Especificação:Torrada Simples: R$ 2.00 reais unidade");
			System.out.printf("Valor Total: %.2f%n",Valor);	}
			
			else {
				
				if (Codigo == 5 && Quantidade > 0 ) {
					
					double Preco = 1.50;
					double Valor = Preco*Quantidade;
				
				System.out.println("Especificação:");
						System.out.println("Refrigerante: R$ 1.50 reais unidade");
				System.out.println();
				System.out.printf("Valor Total: %.2f%n",Valor);	}
			}
			
		}
	}
		
	}

		
	sc.close();

	}

}
