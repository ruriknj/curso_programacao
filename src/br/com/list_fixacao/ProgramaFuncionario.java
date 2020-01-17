package br.com.list_fixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProgramaFuncionario {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			
			System.out.println("Emplyoee #"+i+":");
			
			System.out.print("Id: ");
			
			int id = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("Name: ");
			
			String nome = sc.nextLine();
			
			System.out.print("Salary: ");
			
			Double salario = sc.nextDouble();
			
			lista.add(new Funcionario(id, nome, salario));
		
			System.out.println();
			
		}
			
			System.out.println("------------------------------------------");
			
			System.out.print("Employee id that will have salary increase: ");
			
			int id = sc.nextInt();
			
			Funcionario emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

			if (emp == null) {

				System.out.println("This id does not exist!"); 
				
			} else {
				
				System.out.print("Enter the percentage:");
				
				double percentagem = sc.nextDouble();
				
				emp.aumentoSalario(percentagem);
				
				System.out.println();
			
			}
			
		
		System.out.println("Lista de Funcionarios: ");
		
		for (Funcionario x: lista) {
			
			System.out.printf("%d%s%s%s%.2f\n",x.getId(),", ",x.getNome(),", ", x.getSalario());

			// ou outras opções para listar funcionarios.
			
				System.out.println(x);
				
				System.out.println(lista);
		
		}
		
		
		sc.close();

		}

}
