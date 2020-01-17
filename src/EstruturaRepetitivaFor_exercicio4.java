import java.util.Scanner;

public class EstruturaRepetitivaFor_exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if (y!=0) {
				
				System.out.printf("%.2f%n", (x/y));
			}
			
			else {
				
				System.out.println("divisao impossivel");
			}
				
			
		}
		
	}

}
