package aula13;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Valor Hora: ");
		double valorHora = entrada.nextDouble();
		
		System.out.printf("Quantidade Hora: ");
		double quantidadeHora = entrada.nextDouble();
		
		
		double totalSalario = valorHora * quantidadeHora;
				
				
		System.out.printf("Salario do mês R$: %.2f ", totalSalario);
	}

}
