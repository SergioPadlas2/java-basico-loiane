package aula13;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Altura ");
		double altura = entrada.nextDouble();
		
		
		double pesoIdeal = (72.7*altura) - 58;
		
		
		System.out.printf("Peso ideal: %.2f ", pesoIdeal);
	}

}
