package aula13;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Valor Hora: ");
		double valorHora = entrada.nextDouble();
		
		System.out.printf("Quantidade Hora: ");
		double quantidadeHora = entrada.nextDouble();
		
		double totalSalario = valorHora * quantidadeHora;
		
		double descontoIr = (totalSalario*11)/100;
		double descontoInss = (totalSalario*8)/100;
		double sindicado = (totalSalario*5)/100;
		
		System.out.printf("Desconto IR " + descontoIr);
		System.out.println(descontoInss);
		System.out.println(sindicado);
			
		
	}

}
