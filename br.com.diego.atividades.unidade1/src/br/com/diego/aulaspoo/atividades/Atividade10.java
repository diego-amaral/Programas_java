/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class Atividade10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		double num1 = teclado.nextDouble();

		System.out.println("Digite o segundo valor: ");
		double num2 = teclado.nextDouble();

		double multiplicacao = num1 * num2;

		System.out.printf("A Multiplicação de %.1f com %.1f é %.1f ", num1, num2, multiplicacao);

		teclado.close();

	}

}
