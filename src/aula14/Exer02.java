package aula14;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Primeiro numero ");
		int a = entrada.nextInt();
		
		
		if (a < 0) {
			System.out.println("Numero é negativo");
		} else if (a > 0)
			System.out.println("Positivo");
		else
			System.out.println("Neutro");		
	}

}
