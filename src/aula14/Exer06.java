package aula14;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Primeiro numero ");
		int a = entrada.nextInt();
		
		System.out.printf("Segundo numero ");
		int b = entrada.nextInt();
		
		System.out.printf("Terceiro numero: ");
		int c = entrada.nextInt();
			
		if(a > b && a > c) {
			System.out.println("Maior: " + a);
		} else if (b > c) {
			System.out.println("Maior: " + b);
		} else
			System.out.println("Maior: " + c);
	
	
		
	}

}
