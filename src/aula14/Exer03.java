package aula14;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Digite F OU M: ");
		String letra = entrada.nextLine();
		
		
		switch (letra.toUpperCase()) {
		case "F":
			System.out.println("Feminino");
			break;
		case "M":
			System.out.println("Masculino");
			break;
		default:
			System.out.println("Invalido");
			break;
		}
		
		
		
		
		
	}

}
