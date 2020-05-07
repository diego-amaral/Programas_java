/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o valor do salário R$");
		double salario = teclado.nextDouble();

		double regraFinac50 = 0.5 * salario;
		double regraFinac30 = 0.3 * salario;
		double regraFinac20 = 0.2 * salario;

		System.out.printf("O seu salário é R$ %.2f ", salario);
		System.out.printf("\nVocê deve usar R$ %.2f para as necessidades ", regraFinac50);
		System.out.printf("\nDeve usar R$ %.2f para seus desejos pessoais ", regraFinac30);
		System.out.printf("\nE R$ %.2f para investimento ou pagar as dívidas ", regraFinac20);

		teclado.close();
	}

}
