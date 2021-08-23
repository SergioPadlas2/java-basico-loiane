package aula14;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Primeiro numero ");
		int a = entrada.nextInt();
		
		System.out.printf("Primeiro numero ");
		int b = entrada.nextInt();
				
		if (a > b){
			System.out.println("Maior numero é o "+ a);	
		} else if (b > a) {
			System.out.println("Maior numero é o " + b);
		} else {
			System.out.println("São Iguais");
		}
	}

}
