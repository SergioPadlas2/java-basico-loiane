package aula14;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Primeiro Nota: ");
		double primeira = entrada.nextDouble();
		
		System.out.printf("Segunda Nota: ");
		Double segunda = entrada.nextDouble();
		
		double media = (primeira + segunda) / 2;
		
		if(media >=10) {
			System.out.println("Aprovado com Distinção");
		} else if (media >= 7 && media < 10) {
			System.out.println("Aprovado");
		} else if (media < 7) {
			System.out.println("Reprovado");
		}
		
		
		
		
		
		
		System.out.println(media);
	}

}
