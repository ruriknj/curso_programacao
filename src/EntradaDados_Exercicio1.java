import java.util.Scanner;

public class EntradaDados_Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int a;
		int b;
		a = sc.nextInt();
		b = sc.nextInt();
		int soma = a + b;
	
		System.out.println("Soma= "+soma);
		sc.close();
	
	}
		
}
