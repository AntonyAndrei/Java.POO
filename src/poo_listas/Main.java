package poo_listas;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
		
		lista.add("Antony");
		lista.add("Jaala");
		lista.add(1,"Yui");
		
		 for (String x : lista) {
			 System.out.println(x);
		 }
		 
		 System.out.printf("O Tamanho da lista eh: %d%n"
		 		+ "-------------------------------------%n" , lista.size());
		 
		 lista.remove("Antony");
		 
		 for (String x : lista) {
			 System.out.println(x);
		 }
		 
		 lista.add(0,"Antony");
		 System.out.println("------------------------------------");
		 for (String x : lista) {
			 System.out.println(x);
		 }
		 System.out.println("A posicao de Jaala eh: " + lista.indexOf("Jaala"));
		
	}

}
