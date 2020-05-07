package br.com.diego.javabasico.aulasloiane;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] vetorA = new int[4];
		double[] vetorB = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.printf("Digite o valor %d \n", i + 1);
			vetorA[i] = entrada.nextInt();

			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		// impressão do vetor A
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.printf(vetorA[i] + " ");
		}

		System.out.println();

		DecimalFormat df = new DecimalFormat("###,###.##");

		// impressão do vetor B
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorB[i]) + " ");
		}

		entrada.close();

	}

}
