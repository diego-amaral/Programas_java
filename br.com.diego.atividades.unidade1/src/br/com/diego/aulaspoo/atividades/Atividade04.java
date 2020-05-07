package br.com.diego.aulaspoo.atividades;

/**
 * @author diego_amaral
 *
 */
public class Atividade04 {

	public static void main(String[] args) {

		String nome = "Diego";
		String sexo = "Masculino";
		byte idade = 26;
		String estadoCivil = "Solteiro";
		double salario = 3650;

		System.out.printf("Funcionário %s do sexo %s , idade %d e estado civil %s \nrecebe R$%.2f de salário", nome, sexo,
				idade, estadoCivil, salario);
	}

}
