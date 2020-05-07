/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade12 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		double num1 = teclado.nextDouble();

		System.out.println("Digite o segundo valor: ");
		double num2 = teclado.nextDouble();

		double restoDivisao = num1 % num2;

		System.out.printf("O resto da divisão de %.1f por %.1f é %.1f ", num1, num2, restoDivisao);

		teclado.close();

	}

}
