import java.util.Scanner;

public class EstruturaCondicional_Exercicio7 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x > 0 && y > 0 ) {
		System.out.println("1 Quandrante");	
			
		}
		else if (x < 0 && y > 0) {
		System.out.println("2 Quandrante");
			
		}
		else if (x < 0 && y < 0) {
		System.out.println("3 Quandrante");
			
		}
		else if (x > 0 && y < 0) {
		System.out.println("4 Quandrante");	
		}
		else
			System.out.println(" Origem");	
			
		sc.close(); 
	}

}
