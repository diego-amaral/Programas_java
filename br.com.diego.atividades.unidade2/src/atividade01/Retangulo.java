package atividade01;

public class Retangulo {

	static double largura;
	static double altura;

	 static double area(double b, double a) {
		return b * a;

	}

	static void imprimeArea() {
		System.out.printf("O valor da área é: %.1f",Retangulo.area(largura,altura));
	}

	static double perimetro(double b,double a) {
		return (2*b + 2*a);
	}
	static void imprimePerimetro() {
		System.out.printf("O perímetro é de: %.1f",Retangulo.perimetro(largura, altura));
		
	}
	
}
