package aula14;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.printf("Valor Hora: ");
		double valorHora = entrada.nextDouble();
		
		System.out.printf("Quantidade Horas: ");
		int qtdHora = entrada.nextInt();
		
		double salario = valorHora * qtdHora;
		double valorDescontoFgts = salario * 0.11;
		double valorDescontoInss = salario * 0.1;
		double valorDescontoIr;
		double totalDesconto;
		
		if (salario <= 900) {
			//valorDescontoIr = salario * 0.05;
			System.out.println("Salário Bruto  "  + qtdHora + " * " + valorHora  + " = " + salario);
			System.out.println("(-) IR  ISENTO "  );
			System.out.println("(-) INSS (10%) " + valorDescontoInss);
			System.out.println(" FGTS (11%)  " + (valorDescontoFgts));
			System.out.println("Total Desconto " + (valorDescontoInss) );
			System.out.println("Total Liquido " + (salario -  valorDescontoInss ));
		} else if ((salario > 900) && (salario <= 1500)) {
			valorDescontoIr = salario * 0.05;
			System.out.println("Salário Bruto  "  + qtdHora + " * " + valorHora  + " = " + salario);
			System.out.println("(-) IR (5%) " + valorDescontoIr );
			System.out.println("(-) INSS (10%) " + valorDescontoInss);
			System.out.println(" FGTS (11%)  " + (valorDescontoFgts));
			System.out.println("Total Desconto " + (valorDescontoInss + valorDescontoIr + valorDescontoFgts) );
			System.out.println("Total Liquido " + (salario - valorDescontoIr - valorDescontoInss ));
		} else if ((salario > 1500) && (salario <= 2500)) {
			valorDescontoIr = salario * 0.1;
			System.out.println("Salário Bruto  "  + qtdHora + " * " + valorHora  + " = " + salario);
			System.out.println("(-) IR (10%) " + valorDescontoIr );
			System.out.println("(-) INSS (10%) " + valorDescontoInss);
			System.out.println(" FGTS (11%)  " + (valorDescontoFgts));
			System.out.println("Total Desconto " + (valorDescontoInss + valorDescontoIr + valorDescontoFgts) );
			System.out.println("Total Liquido " + (salario - valorDescontoIr - valorDescontoInss ));
		} else if (salario > 2500) {
			valorDescontoIr = salario * 0.2;
			System.out.println("Salário Bruto  "  + qtdHora + " * " + valorHora  + " = " + salario);
			System.out.println("(-) IR (20%) " + valorDescontoIr );
			System.out.println("(-) INSS (10%) " + valorDescontoInss);
			System.out.println(" FGTS (11%)  " + (valorDescontoFgts));
			System.out.println("Total Desconto " + (valorDescontoInss + valorDescontoIr + valorDescontoFgts) );
			System.out.println("Total Liquido " + (salario - valorDescontoIr - valorDescontoInss ));
		}
	}

}
