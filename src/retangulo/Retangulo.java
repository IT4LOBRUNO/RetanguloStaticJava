package retangulo;

public class Retangulo {
	public static double Area (double base, double altura) {
		return base * altura;
	}
	
	public static double Perimetro (double base, double altura) {
		return base * 2 + altura * 2;
	}
	public static void Resultado(double area, double perimetro) {
		System.out.println("Área do retângulo: " + area);
		System.out.println("Perímetro do retângulo" + perimetro);
	}
}
