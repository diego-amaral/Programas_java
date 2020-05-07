package atividade05;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite quantas contas irá cadastrar:");
		int maxContas = teclado.nextInt();
		teclado.nextLine();
		Banco banco = new Banco(maxContas);

		for (int i = 0; i < maxContas; i++) {
			System.out.println("Digite o nome do titular(a):");
			String nomeTitular = teclado.nextLine();

			System.out.println("Digite o número da conta:");
			String numConta = teclado.nextLine();

			banco.cadastrarConta(nomeTitular, numConta);

		}
		banco.infoContas();
		
		banco.depositaConta();
		
		banco.confereSaldoConta();
		
		banco.contasCriadas();
		
		banco.infoContas();
		
		banco.saqueConta();
		
		banco.infoContas();
		
		banco.tranfereValor();
		
		banco.infoContas();
		
		banco.saldoTotal();

		teclado.close();
	}
}
