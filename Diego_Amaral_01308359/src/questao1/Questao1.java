package questao1;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome do vendedor:");
		String nome = teclado.nextLine();

		System.out.println("Digite o salário R$");
		double salario = teclado.nextDouble();

		System.out.println("Digite o total de vendas R$");
		double totalVendadas = teclado.nextDouble();

		double comissao = (totalVendadas * 0.12) + salario;
		System.out.printf("%s com salário R$%.2f vendeu R$%.2f com 0.12 de comissão o seu sálario agora é R$%.2f", nome,
				salario, totalVendadas, comissao);

		teclado.close();
	}

}
