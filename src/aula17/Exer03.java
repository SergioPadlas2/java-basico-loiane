package aula17;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean estadoCivil = true;
		String nome, estado;

		System.out.printf("Nome: ");
		nome = entrada.nextLine();

		while (nome.length() < 3) {
			System.out.printf("Nome invalido, Digite novamente!!: ");
			nome = entrada.nextLine();
		}
		System.out.println("Nome digitado corretamente: " + nome);

		System.out.printf("Idade: ");
		int idade = entrada.nextInt();

		while (idade < 0 || idade > 150) {
			System.out.printf("Idade inválida, Digite novamente: ");
			idade = entrada.nextInt();
		}
		System.out.println("Idade Digitada correta " + idade);

		System.out.printf("Salario: ");
		double salario = entrada.nextDouble();

		while (salario <= 0) {
			System.out.printf("Salário precisa ser mais que R$ 0");
			salario = entrada.nextDouble();
		}
		System.out.println("Salario Digitado Corretamente");

		do {

			System.out.printf("Estado Civil ");
			estado = entrada.next();

			if (estado.equalsIgnoreCase("s") || estado.equalsIgnoreCase("c")) {
				estadoCivil = true;

			} else {

				System.out.println("Estado civil incorreto, Digite novamente");

			}

		} while (!estadoCivil);

		System.out.println("Correto");

	}
	

}
