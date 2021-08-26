package aula17;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite o valor entre 0 e 10");
		int valor = entrada.nextInt();
		
		
		while (valor < 0 || valor > 10) {
			System.out.println("Informe um valor válido");
			valor = entrada.nextInt();
		}
		
		System.out.println("Parabéns tu leu a menssagem");
		
	}

}
