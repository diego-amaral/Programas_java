/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade08 {

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		double num1 = teclado.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double num2 = teclado.nextDouble();
		
		double soma = num1+num2;
		
		System.out.printf("A soma de %.1f com %.1f � %.1f ",num1,num2,soma);
		
		teclado.close();

	}

}
