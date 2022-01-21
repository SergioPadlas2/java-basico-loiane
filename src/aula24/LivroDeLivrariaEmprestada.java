package aula24;

import java.util.Date;

public class LivroDeLivrariaEmprestada {

	public static void main(String[] args) {

		LivroDeLivraria lv = new LivroDeLivraria();

		lv.autor = "Loraine";
		lv.genero = "Suspense";
		lv.plu = 777;
		lv.titulo = "O terror";

		lv.dataEntrega = new Date();
		
		
		System.out.println(lv.dataEntrega);

	}
}