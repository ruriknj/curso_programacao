import java.util.Scanner;

public class EstruturaRepetitivaWhile_Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a senha: ");

		int senha = sc.nextInt();

		while (senha != 2002) {

			System.out.println("Senha inválida");
			senha = sc.nextInt();
		}

		System.out.println("Acesso Permitido");

		sc.close();
	}

}
