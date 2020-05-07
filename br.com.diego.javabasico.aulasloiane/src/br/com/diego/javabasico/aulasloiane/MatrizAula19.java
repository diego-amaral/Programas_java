package br.com.diego.javabasico.aulasloiane;

import java.util.Random;

public class MatrizAula19 {

	public static void main(String[] args) {

		int[][] numerosAleatorios = new int[4][4];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(100);
			}
		}

		int maior = Integer.MIN_VALUE;
		int linha = 0;
		int coluna = 0;

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				if (numerosAleatorios[i][j] > maior) {
					maior = numerosAleatorios[i][j];
					linha = i;
					coluna = j;
				}
			}

		}
		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");

			}
			System.out.println();
		}

		System.out.printf("Maior valor = %d \n" , maior);
		System.out.printf("Linha = %d \n" , linha + 1 );
		System.out.printf("Coluna = %d \n" , coluna + 1);

	}

}
