package questao2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final double LITROS = 12;

		System.out.println("Digite o tempo gasto na viagem (em horas)");
		int horas = teclado.nextInt();

		System.out.println("Digite a velocidade média durante a viagem (em KM/h)");
		int velocidade = teclado.nextInt();

		double resultado = (horas * velocidade) / LITROS;

		System.out.printf("O tempo de viagem foi de %dHs a uma velocidade de %d KM/h", horas, velocidade);
		System.out.printf("\nA quantidade de combustível necessária é de %.3fL",resultado);

		teclado.close();
	}

}
