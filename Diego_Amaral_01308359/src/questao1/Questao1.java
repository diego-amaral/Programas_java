package questao1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome do vendedor:");
		String nome = teclado.nextLine();

		System.out.println("Digite o sal�rio R$");
		double salario = teclado.nextDouble();

		System.out.println("Digite o total de vendas R$");
		double totalVendadas = teclado.nextDouble();

		double comissao = (totalVendadas * 0.12) + salario;
		System.out.printf("%s com sal�rio R$%.2f vendeu R$%.2f com 0.12 de comiss�o o seu s�lario agora � R$%.2f", nome,
				salario, totalVendadas, comissao);

		teclado.close();
	}

}
