package br.com.diego.javabasico.aulasloiane;

public class ArraysAula19 {

	public static void main(String[] args) {
		double[] temperaturas = new double[365];
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;

		System.out.printf("O valor da temperatura do dia 1 é %.1f ", temperaturas[0]);

		System.out.printf("\nO tamanho do array: %d ", temperaturas.length);

		for (int i = 0; i < temperaturas[i]; i++) {
			System.out.printf("\nAs temperaturas do dia %d é: %.1f", i + 1, temperaturas[i]);
		}
	}

}
