package aula13;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Graus Celsius: ");
		double celsius = entrada.nextDouble();
		
		double fahrenheit =(celsius * 1.8)+32;
		
		System.out.println("A temperatura " +  celsius + "C é igual a " + fahrenheit + "F");
		
		
	}

}
