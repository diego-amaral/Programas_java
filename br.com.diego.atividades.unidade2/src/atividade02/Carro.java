package atividade02;

import java.util.Scanner;

public class Carro {

	Scanner teclado = new Scanner(System.in);
	private double velocidadeAtual = 0;

	void testeLiga() {
		byte opcao = 0;

		while (opcao != 1) {
			System.out.println("Digite 1 para ligar");
			opcao = teclado.nextByte();

			if (opcao == 1) {

				System.out.println("O carro será ligado aguarde...\n");
				break;
			} else if (opcao != 1) {
				System.out.println("Algo deu errado\n");

			}

		}

	}

	void liga() {

		System.out.println("O carro está ligado!");
	}

	void acelera(double valor) {
		this.velocidadeAtual += valor;
	}

	void aumentadoVelocidade() {
		byte continuar = 1;
		while (continuar == 1) {

			System.out.println("Vamos acelerar! informe a velocidade:");
			acelera(teclado.nextDouble());
			mostraVelocidade();
			System.out.println("Deseja continuar acelerando?");
			System.out.println("Digite {1} para continuar {0} par começar a freiar\n");
			continuar = teclado.nextByte();
			if (continuar == 0) {
				System.out.println("Ok vamos começar a freiar...\n");
				break;
			}
		}

	}

	void mostraVelocidade() {
		System.out.printf("A velocidade atual é de: %.1f km/h\n", this.velocidadeAtual);
	}

	void freia(double valor) {
		this.velocidadeAtual -= valor;
	}

	void diminuindoVelocidade() {

		while (this.velocidadeAtual != 0) {

			System.out.println("Vamos freiar! informe o quanto quer diminuir");
			freia(teclado.nextDouble());
			mostraVelocidade();
			System.out.println("\ntemos que continuar até o veículo parar completamete");
			if (this.velocidadeAtual == 0) {
				System.out.println("\nOk! O carro parou!");
				break;
			}
		}
		teclado.close();
	}

	void desliga() {
		System.out.println("Desligando o carro, aguarde...\n");
		System.out.println("O carro foi desligado!");
	}

}
