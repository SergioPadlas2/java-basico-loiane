package aula17;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
        double popA;
        double popB;
        double taxaA;
        double taxaB;
		
		System.out.println("Digite a popula��o A: " );
		popA = entrada.nextDouble();		
		
		while (popA <= 0) {
		System.out.println("Popula�ao invalida digite novamente: " );
		popA = entrada.nextDouble();	
		}
		
		System.out.println("Digite a popula��o B: " );
		popB = entrada.nextDouble();		
		
		while (popB <= 0) {
		System.out.println("Popula�ao invalida digite novamente: " );
		popB = entrada.nextDouble();	
		}
		

		System.out.println("Taxa de crescimento A" );
		taxaA = entrada.nextDouble();		

		System.out.println("Taxa de crescimento B" );
		taxaB = entrada.nextDouble();		
		
		int cont = 0;

		while(popA < popB){
			popA += (popA/100) * taxaA;
			popB += (popB/100) * taxaB;
			cont ++;
		}
		
		
		System.out.println("Popula��o A " + popA);
		System.out.println("Popula��o B " + popB);


		
		System.out.println(cont);
		
	}

}
