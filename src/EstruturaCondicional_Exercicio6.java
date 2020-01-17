import java.util.Scanner;

public class EstruturaCondicional_Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if (valor >= 0.0 && valor <= 25.00) {
			
			System.out.println("Valor esta no intervalo: [0,25]");
		}
			else {
				if (valor > 25.00 && valor <= 50.00 ) {
					
					System.out.println("Valor esta no intervalo: [25,50]");
				}
				else
					if (valor > 50.00 && valor <= 75.00 ) {
						
						System.out.println("Valor esta no intervalo: [50,75]");
					}
					else
						if (valor > 75.00 && valor <= 100.00 ) {
							
							System.out.println("Valor esta no intervalo: [75,100]");
						}
				System.out.println("Fora do intervalo");
			}
		
		sc.close();
	}

}
