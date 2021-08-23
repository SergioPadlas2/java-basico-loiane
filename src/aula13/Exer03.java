package aula13;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);

		
		System.out.printf("Digite um numero: ");
		double numero1 = entrada.nextDouble();
		
		System.out.printf("Digite um numero: ");
		double numero2 = entrada.nextDouble();
		
		
		double soma = numero1 + numero2;
		
		
		System.out.println("A soma dos dois numeros é " + soma);
		
	}

}
