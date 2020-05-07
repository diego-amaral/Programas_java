/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome: ");
		String nome = teclado.nextLine();

		System.out.println("Digite o endereço: ");
		String endereco = teclado.nextLine();

		System.out.println("Digite o produto: ");
		String produto = teclado.nextLine();

		System.out.printf("O cliente %s solicitou o produto (%s) para o endereço: \n%s", nome, produto, endereco);

		teclado.close();
	}

}
