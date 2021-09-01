package aula17;

public class Exer04 {

	public static void main(String[] args) {

		
		double popA = 80000;
		double popB = 200000;
		int cont = 0;

		
		while(popA < popB){
			popA += (popA/100)*3;
			popB += (popB/100)*0.15;
			cont ++;
		}
		
		
		System.out.println("População A " + popA);
		System.out.println("População B " + popB);


		
		System.out.println(cont);
		
		
		
	}

}
