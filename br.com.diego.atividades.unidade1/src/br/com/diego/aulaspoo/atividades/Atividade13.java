/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		String nome = teclado.nextLine();

		System.out.println("Digite a primeira nota:");
		double nota1 = teclado.nextDouble();

		System.out.println("Digite a segunda nota:");
		double nota2 = teclado.nextDouble();

		double media = (nota1 + nota2) / 2;
		
		System.out.printf("O aluno %s obteve a média %.1f ", nome, media);
		
		teclado.close();
	}

}
