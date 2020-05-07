
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		String nome = teclado.nextLine();

		System.out.println("Digite o CPF: ");
		String cpf = teclado.nextLine();

		System.out.println("Digite o sexo {Maculino} / {Feminino} :");
		String sexo = teclado.nextLine();

		System.out.println("Digite a idade: ");
		byte idade = teclado.nextByte();

		System.out.printf("O aluno %s com CPF %s do sexo {%s} tem %d anos", nome, cpf, sexo, idade);
		
		teclado.close();

	}

}
