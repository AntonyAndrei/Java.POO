package membrosEstaticos;

import java.util.Scanner;

public class Moeda {
	
	Scanner ler = new Scanner(System.in);
	
	public double dolar;
	
	public void lerDolar() {
		System.out.println("Qual o valor do seu produto em dolar? ");
		dolar = ler.nextDouble();
	}
	
	
}
