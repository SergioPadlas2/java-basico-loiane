package aula14;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);

		
		System.out.printf("Primeiro numero ");
		double a = entrada.nextDouble();

		System.out.printf("Segundo numero ");
		double b = entrada.nextDouble();

		System.out.printf("Terceiro numero: ");
		double c = entrada.nextDouble();
		
		
		if (a < b && a < c) {
			System.out.println("Menor  primeiro digitado: " + a);
		} else if (b < c) {
			System.out.println("Menor segundo digitado: " + b);
		} else
			System.out.println("Menor terceiro digitado: " + c);

		
	}

}
