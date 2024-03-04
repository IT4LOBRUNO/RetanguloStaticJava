package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import retangulo.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe a base do Retangulo: ");
		double base = sc.nextDouble();
		System.out.print("Informe a altura do Retangulo: ");
		double altura = sc.nextDouble();
		
		double area = Retangulo.Area(base, altura);
		double perimetro = Retangulo.Perimetro(base, altura);
		
		Retangulo.Resultado(area, perimetro);
		sc.close();
	}

}
