package aula17;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Nome: ");
		String nome = entrada.nextLine();

//		
//		System.out.printf("Idade: ");
//		int idade = entrada.nextInt();
//		
//		System.out.printf("Idade: ");
//		int salario = entrada.nextInt();
//		
//
//		System.out.printf("Sexo: ");
//		String sexo = entrada.nextLine();
//		
//		System.out.printf("Estado Civeil: ");
//		String estadp = entrada.nextLine();

		while (nome.length() < 3) {
			System.out.printf("Nome inválido, Digite novamente!!: ");
			nome = entrada.nextLine();
		}
		System.out.println("Nome digitado corretamente: " + nome);

		System.out.printf("Idade: ");
		int idade = entrada.nextInt();

		while (idade < 0 || idade > 150) {
			System.out.printf("Idade inválida, Digite novamente: ");
			idade = entrada.nextInt();
		}
		System.out.println("iIdade Digitada correta " + idade);

	}

}
