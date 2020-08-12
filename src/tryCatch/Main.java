package tryCatch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		try {
			String[] vect = ler.nextLine().split(" ");
			int posicao = ler.nextInt();
			System.out.println(vect[posicao]);
		} catch (java.lang.ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao invalida! ");
		} catch (java.util.InputMismatchException e) {
			System.out.println("Caracter invalido!");
		}
		
		
		System.out.println("Fim da Apicacao");
	}

}
