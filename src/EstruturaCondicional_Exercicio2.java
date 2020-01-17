import java.util.*;

public class EstruturaCondicional_Exercicio2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		System.out.println("Entrada:" +numero);
		
		if (numero%2==0) {
			System.out.println("Saída:PAR");
			
		}	
			
			else { 
		System.out.println("Saída:IMPAR");
		}
		
		sc.close();

	}

}
