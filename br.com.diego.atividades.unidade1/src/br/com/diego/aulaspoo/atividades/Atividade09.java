/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class Atividade09 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		double num1 = teclado.nextDouble();

		System.out.println("Digite o segundo valor: ");
		double num2 = teclado.nextDouble();

		double subtracao = num1 - num2;

		System.out.printf("A subtra��o de %.1f com %.1f � %.1f ", num1, num2, subtracao);

		teclado.close();

	}

}
