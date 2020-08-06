package metodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		List<FiguraGeometrica> figuras = new ArrayList<>();

		Scanner ler = new Scanner(System.in);

		System.out.print("Qual sera o numero de FIguras geometricas? ");
		int n = ler.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Insira os dados da Figura geometrica #" + (i+1));
			System.out.print("Retangulo ou Ciurculo? (R/C) ");
			char ch = ler.next().charAt(0);
			System.out.print("Cor? (verde, vermelho ou azul) ");
			Cor cor = Cor.valueOf(ler.next());
			if (ch == 'R') {
				System.out.print("Altura do Retangulo: ");
				double altura = ler.nextDouble();
				System.out.print("Largura do Retangulo: ");
				double largura = ler.nextDouble();
				figuras.add(new Retangulo(cor, largura, altura));
			} else {
				System.out.print("Raio do Circulo: ");
				double raio = ler.nextDouble();
				figuras.add(new Circulo(cor, raio));
			}
		}

		System.out.println();
		System.out.println("Area Das Figuras: ");

		for (FiguraGeometrica figura : figuras) {
			System.out.println(String.format("%.2f", figura.area()));
		}

		ler.close();

	}

}
