/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome: ");
		String nome = teclado.nextLine();

		System.out.println("Digite o sexo {Masculino} / {Feminino}");
		String sexo = teclado.nextLine();

		System.out.println("Digite a idade");
		byte idade = teclado.nextByte();

		System.out.println("Digite o estado civil -> Solteiro; Casado; Divorciado; Vi�vo");
		String estadoCivil = teclado.next();

		System.out.println("Digite o sal�rio R$");
		double salario = teclado.nextDouble();

		System.out.printf("Funcion�rio %s do sexo {%s} idade %d e estado civil %s recebe %.2f de sal�rio ", nome, sexo,
				idade, estadoCivil, salario);

		teclado.close();
	}

}
