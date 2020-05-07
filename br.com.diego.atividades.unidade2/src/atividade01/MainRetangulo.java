package atividade01;

import java.util.Scanner;

public class MainRetangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o valor da base:");
		Retangulo.largura = teclado.nextDouble(); 
		
		
		System.out.println("Digite o valor da altura");
		Retangulo.altura = teclado.nextDouble();
		
		teclado.close();
		
		Retangulo.area(Retangulo.largura,Retangulo.altura);
		Retangulo.imprimeArea();
		
		System.out.println();
		
		Retangulo.perimetro(Retangulo.largura,Retangulo.altura);
		Retangulo.imprimePerimetro();

	}

}
