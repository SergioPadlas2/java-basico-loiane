package aula13;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Comprimento: ");
		double comprimento = entrada.nextDouble();
		
		System.out.printf("Altura: ");
		double altura = entrada.nextDouble();
		
		double areaDobro = 2 * (comprimento * altura);
		
		System.out.println("A área do quadrado é: " + areaDobro +" M2");
	}

}
