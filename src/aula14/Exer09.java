package aula14;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Primeiro numero ");
		int a = entrada.nextInt();

		System.out.printf("Segundo numero ");
		int b = entrada.nextInt();

		System.out.printf("Terceiro numero: ");
		int c = entrada.nextInt();

		if ( ( a > b && a > c ) && ( c > b ) ) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} else if ( ( a > b && a > c ) && ( c > b ) ) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		} else if ( ( b > a && b > c ) && ( a > c ) ) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		} else if( ( b > a && b > c ) && ( c > a ) ) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}else if ( ( c > a && c > b ) && ( a > b ) )  {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}else if ( ( c > a && c > b ) && ( b > a ) ){
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		

	}
}
