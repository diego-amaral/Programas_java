/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego
 *
 */
public class Atividade11 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		double num1 = teclado.nextDouble();

		System.out.println("Digite o segundo valor: ");
		double num2 = teclado.nextDouble();

		double divisao = num1 / num2;

		System.out.printf("A divisão de %.1f por %.1f é %.1f ", num1, num2, divisao);

		teclado.close();

	}

}
