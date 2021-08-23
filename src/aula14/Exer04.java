package aula14;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Digite uma Letra ");
		String letra = entrada.nextLine();
		
		switch (letra.toUpperCase()) {
		case "A" : case "E" : case "I" : case "O" : case "U":
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");
			break;
		}
	}

}
