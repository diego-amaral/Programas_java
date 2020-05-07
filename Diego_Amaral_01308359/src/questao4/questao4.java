package questao4;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final int ANO = 365;

		System.out.println("Digite sua idade em dias:");
		int idadeDias = teclado.nextInt();
		teclado.close();

		int anos = idadeDias / ANO;
		int meses = (idadeDias % ANO) / 30;
		int dias = (idadeDias % ANO) % 30;

		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(as)",anos,meses,dias);
		
	}

}
