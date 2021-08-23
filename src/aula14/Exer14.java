package aula14;

import java.util.Locale;
import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Locale localeAmericano = new Locale("en", "US");
		Locale.setDefault(localeAmericano);
		
		System.out.printf("Digite a primeira nota: ");
		double notaA = entrada.nextDouble();
		
		
		System.out.printf("Digite a segunda nota: ");
		double notaB = entrada.nextDouble();
		
		double media = (notaA + notaB) / 2;
		
		String aproveitamento = "";
		if((media >= 9 ) && (media <= 10)){
			aproveitamento = "A";
		} else if ((media >= 7.5) && (media < 9 )) {
			aproveitamento = "B";
		} else if ((media >=6) && (media < 7.5)) {
			aproveitamento = "C";
		} else if ((media >= 4) && (media < 6)) {
			aproveitamento = "D";
		} else if ((media < 4) && (media >=0)) {
			aproveitamento = "E";
		}
		
		System.out.println("Aproveitamento: " + aproveitamento);
		System.out.println("Média: " + media);
		
		
		switch (aproveitamento) {
		case "A":
		case "B":
		case "C":
			System.out.println("Aprovado");
		break;
		case "D":
		case "E":
			System.out.println("Aprovado");
		break;
			
		}
	}

}
