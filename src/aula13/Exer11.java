package aula13;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Primeiro ");
		int primeiro = entrada.nextInt();
		
		System.out.printf("Segundo ");
		int segundo = entrada.nextInt();
		
		System.out.printf("Terceiro ");
		double terceiro = entrada.nextDouble();
		
		
		double a = (primeiro*2);
		double b = (segundo/2);
		double c = (primeiro*3) + (terceiro);
		double d = (Math.pow(terceiro, 2));
		
		
		System.out.println("dobro do primeiro " + a + " e a metade segundo: " + b);
		System.out.println("Soma do triplo do primeiro mais o terceiro : " + c);
		System.out.println("Terceiro elevado ao cubo  : " + d);

	}

}
