package aula14;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite um ano: ");
		int ano = entrada.nextInt();
		
		int restoDivisaoA = ano % 4;
		int restoDivisaoB = ano % 100;
		int restoDivisaoC = ano % 400;

		System.out.println(restoDivisaoA);
		System.out.println(restoDivisaoB);
		System.out.println(restoDivisaoC);

		
		if((ano % 4 == 0) && (ano % 100 ==0) || (ano % 400 !=0)) {
			System.out.println("O ano " + ano + " é Bissesto");
		} else {
			System.out.println("Não é bissesto");
		}
		
	}

}
