package aula17;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.printf("User: ");
		String user = entrada.nextLine();
		
		
		System.out.printf("Senha: ");
		String senha = entrada.nextLine();
		
		
		
		while(user.equalsIgnoreCase(senha) ){
			
			System.out.println("Usuario e Senha inválidos, Digite Novante");
			
			System.out.println("User: ");
			user = entrada.nextLine();
			
			System.out.println("Senha: ");
			senha = entrada.nextLine();
			
		}
		
		
		System.out.println(" Pode entrar");

		
		
		
		
		
	}

}
