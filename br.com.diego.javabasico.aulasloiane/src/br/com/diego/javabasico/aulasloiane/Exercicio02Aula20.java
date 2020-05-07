package br.com.diego.javabasico.aulasloiane;

import java.util.Random;

public class Exercicio02Aula20 {

	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
			System.out.println();
		}

		int maiorLinha5 = 0;
		int menorLina5 = 0;
		int linha5 = 5;
		for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
			if (numerosAleatorios[linha5][i] > maiorLinha5) {
				maiorLinha5 = numerosAleatorios[linha5][i];
			}
			if (numerosAleatorios[linha5][i] < menorLina5) {
				menorLina5 = numerosAleatorios[linha5][i];
			}

		}
		System.out.printf("Maior valor da linha 5 = %d ", maiorLinha5);
		System.out.printf("Menor valor da linha 5 = %d ", menorLina5);

	}

}
