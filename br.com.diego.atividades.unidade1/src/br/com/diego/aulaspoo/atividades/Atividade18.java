/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe sua idade:");
		byte idade = teclado.nextByte();

		if (idade > 40) {
			System.out.println("Você está no grupo de risco");
		}else {
			System.out.println("Você não está no grupo de risco");
		}

		teclado.close();
	}

}
