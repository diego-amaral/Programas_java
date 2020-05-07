/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade16 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a média do aluno para saber se ele foi aprovado: ");
		double media = teclado.nextDouble();

		if (media >= 7.0) {

			System.out.println("O aluno foi aprovado");
		} else {

	 		System.out.println("O aluno foi reprovado");
		}

		teclado.close();

	}

}
