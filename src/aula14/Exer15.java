package aula14;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("Digite Primeiro lado: ");
		int a = entrada.nextInt();
		
		System.out.printf("Digite Segundo lado: ");
		int b = entrada.nextInt();
		
		System.out.printf("Digite Terceiro lado: ");
		int c = entrada.nextInt();
		
		boolean triagulo = (a +b > c) || (b + c > a) || (c + a  > b) ;
		
		boolean trianguloEquilatero = (a == b) && (b == c) && (c == a);
		
		boolean trianguloIsoceles = (a == b) || (b ==c ) || (c ==  a);
	
		boolean trianguloEscaleno = (a != b) || (b != c) || (c != a); 
			
		
		if (triagulo == true) {
			System.out.println("Triangulo");
		} if (trianguloEquilatero == true) {
			System.out.println("Equilatero");
		} if (trianguloIsoceles == true) {
			System.out.println("Isoceles");
		} else  if (trianguloEscaleno ==true) {
			System.out.println("Escaleno");
		} else {
			System.out.println("Não forma triagulo");
		}

		

	}

}
