package aula13;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Graus Fahrenheit: ");
		double fahrenheit = entrada.nextDouble();
		
		double celsius = (5 * (fahrenheit-32) / 9);
		
		
		System.out.println("A temperatura " +  fahrenheit + " F é igual a " + celsius + " C");
		
				
		

	}

}
