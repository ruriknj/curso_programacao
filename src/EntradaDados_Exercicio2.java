import java.util.Scanner;

public class EntradaDados_Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double raio;
		double pi =  3.14159;
		double A;
		
		raio = sc.nextDouble();
		
		A = pi*raio*raio;
		
		System.out.printf("A= %.4f", A);

	}

}
