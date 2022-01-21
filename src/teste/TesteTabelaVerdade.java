package teste;

public class TesteTabelaVerdade {

	public static void main(String[] args) {

		boolean a = false;
		boolean b = true;
		
		
		boolean resultado = a && b; 
		boolean resultado2 = (!a && b); 

		
		
		System.out.println(resultado);
		System.out.println(resultado2);



		

		for(int i =1; i<=3; i++) {
			for(int j =0; j<=2; j+=2) {
				System.out.println(i + " " + j);
			}
		}
		
		
		
		
	} 
}


