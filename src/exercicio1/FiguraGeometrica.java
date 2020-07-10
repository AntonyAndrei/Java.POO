package exercicio1;

import java.util.Scanner;

public class FiguraGeometrica {
	Scanner ler = new Scanner(System.in);
	public String nome;
	public double altura;
	public double base;
	public double baseMaior;
	public double baseMenor;
	public int x;
	
	public void iniciarGeometrico() {
		System.out.printf("Qual Figura geométrica vc quer cacular a área? %n"
						 + "Digite 1 para Triangulo%n"
						 + "Digite 2 para Quadrilátero%n"
						 + "Digite 3 para Trapézio. %n"
						 + "%n"
						 + "Digite Sua Opcao: ");
		
		x = ler.nextInt();

		switch (x) {
		case 1:
			nome = "Triangulo";
			System.out.print("Qual a altura do triangulo? ");
			altura = ler.nextDouble();
			System.out.print("Qual a base do triangulo? ");
			base = ler.nextDouble();
			break;

		case 2:
			nome = "Quadrilátero";
			System.out.print("Qual a altura do quadrilátero? ");
			altura = ler.nextDouble();
			System.out.print("Qual a base do quadrilátero? ");
			base = ler.nextDouble();
			break;

		case 3:
			nome = "Trapézio";
			System.out.print("Qual a altura do trapézio? ");
			altura = ler.nextDouble();
			System.out.print("Qual a Base maior do trapézio? ");
			baseMaior = ler.nextDouble();
			System.out.print("Qual a Base menor do trapézio? ");
			baseMenor = ler.nextDouble();
			break;

		default:
			System.out.println("Opcao inválida!");
			break;
		}
	}

	public double area() {
		double areaFinal = 0;

		switch (x) {

		case 1:
			areaFinal = base * altura / 2;
			break;

		case 2:
			areaFinal = base * altura;
			break;

		case 3:
			areaFinal = ((baseMaior + baseMenor) * altura) / 2;
			break;

		}

		return areaFinal;

	}

	public double perimetro() {
		return 2 * (base + altura);
	}
	
	public double diagonal() {
		return Math.sqrt(altura * altura + base * base);
	}
	
	public void listarDados() {
		System.out.printf("Seu %s tem: %.2f de Area. %n"
						, nome, area());
	}

}
