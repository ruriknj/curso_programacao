import java.util.Scanner;

public class EstruturaCondicional_Exercicio4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int HoraI = sc.nextInt();
		
		int HoraF = sc.nextInt();
		
		int HoraT = (HoraF - HoraI);
		
		System.out.println("Entrada: "+HoraI+ " " + HoraF);
		
		if (HoraI < HoraF) {
			
			HoraT = HoraF - HoraI;
		}
		
		else {
			
			HoraT = (24 - HoraI) + HoraF;
		}
		System.out.println();
		System.out.println("O jogo durou: "+HoraT);
		
		sc.close();
	}

}
