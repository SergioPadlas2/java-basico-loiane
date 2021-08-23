package aula14;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite uma Letra: ");
		String letra = entrada.nextLine();
		
		switch (letra.toUpperCase()) {
		case "M" :
			System.out.println("Bom dia!!");
			break;
		case "V" :
			System.out.println("Boa tarde!!");
			break;
		case "N" :
			System.out.println("Boa Noite!!");
			break;
		default:
			System.out.println("Valor Inválido!!!!!!");
			break;
		}
		
		
		
		
		
		
		
	}

}

