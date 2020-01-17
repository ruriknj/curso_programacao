
import java.util.*;

public class EstruturaCondicional_Exercicio3 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int N1 = sc.nextInt();
		
		int N2 = sc.nextInt();
		
		System.out.println("Entrada:"+N1+ " " + N2);
		 
		
		if (N1 > N2) {
			
			if (N1%N2==0) { 
				
				System.out.println("Saída: São múltiplos");
		
			}
			
			else	{
				
				System.out.println("Saída: Não são múltiplos");
			}
			
		}
			else {
				
				if (N2 > N1) {
					
				}
					if (N2%N1==0) {
				
						System.out.println("Saída: São múltiplos");
					}
			
					else {
				
						System.out.println("Não são múltiplos");
			}
		}
		
		sc.close();
	}

}
