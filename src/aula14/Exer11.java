package aula14;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Digite seu salário: ");
		double salario = entrada.nextDouble();
		double valorRejuste;
		double valorComReajuste;

		if (salario <= 280) {
			valorRejuste = salario * 0.2;
			System.out.println("Salário atual: " + salario);
			System.out.println("Porcantagem do Reajuste  20%");
			System.out.println("Valor do Reajuste R$ " + valorRejuste);
			System.out.println("Valor " + (salario + valorRejuste));
		} else if ((salario > 280) && (salario <= 1000)) {
			valorRejuste = salario * 0.15;
			System.out.println("Salário atual: " + salario);
			System.out.println("Porcantagem do Reajuste  15%");
			System.out.println("Valor do Reajuste R$ " + valorRejuste);
			System.out.println("Valor " + (salario + valorRejuste));
		} else if ((salario > 700) && (salario <= 1500)) {
			valorRejuste = salario * 0.1;
			System.out.println("Salário atual: " + salario);
			System.out.println("Porcantagem do Reajuste  10%");
			System.out.println("Valor do Reajuste R$ " + valorRejuste);
			System.out.println("Valor " + (salario + valorRejuste));
		} else if (salario > 1500) {
			valorRejuste = salario * 0.05;
			System.out.println("Salário atual: " + salario);
			System.out.println("Porcantagem do Reajuste  5%");
			System.out.println("Valor do Reajuste R$ " + valorRejuste);
			System.out.println("Valor " + (salario + valorRejuste));
		}

	}

}
