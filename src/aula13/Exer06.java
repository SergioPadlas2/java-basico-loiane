package aula13;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Qual o raio?");
		double raio = entrada.nextDouble();
		
		
		
		double areaCirculo = (3.14 *(Math.pow(raio, 2)));
		
		
		System.out.println(areaCirculo);
	}

}
