/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade17 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a temperatura do 1º dia:");
		double temperaturaDia1 = teclado.nextDouble();

		System.out.println("Informe a temperatura do 2º dia:");
		double temperaturaDia2 = teclado.nextDouble();

		if (temperaturaDia1 < 20 && temperaturaDia2 < 20) {
			System.out.println("Vai chover");
		} else if (temperaturaDia1 < 20 && temperaturaDia2 > 20) {

			System.out.println("Não vai chover");
		} else if (temperaturaDia1 > 20 && temperaturaDia2 < 20) {

			System.out.println("Vai chover");
		} else if (temperaturaDia1 > 20 && temperaturaDia2 > 20) {
			System.out.println("Vai chover");
		}

		teclado.close();
	}

}
