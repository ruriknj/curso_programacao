import java.util.Scanner;

public class EstruturaRepetivivaFor_Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i=0;i <= n; i++) {
			
			double x = sc.nextDouble();
			
			double y = sc.nextDouble();
			
			double z = sc.nextDouble();
			
			double media = (2*x + 3*y + 5*z)/10;
			
			System.out.println("A media ponderada é: "+media);
			
		}
				
		

	}

}
