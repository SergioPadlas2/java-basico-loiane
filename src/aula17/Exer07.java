package aula17;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;

		for (int i = 0; i <5; i++) {
			System.out.println("Entre com um numero ");
			num = entrada.nextInt();

			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("Maior numero " + maior);

	}

}
