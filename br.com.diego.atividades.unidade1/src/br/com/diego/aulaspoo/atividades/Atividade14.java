/**
 * 
 */
package br.com.diego.aulaspoo.atividades;

import java.util.Scanner;

/**
 * @author diego_amaral
 *
 */
public class Atividade14 {


	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o 1� sal�rio R$:");
		double salario1 = teclado.nextDouble();
		
		System.out.println("Digite o 2� sal�rio R$:");
		double salario2 = teclado.nextDouble();
		
		System.out.println("Digite o 3� sal�rio R$:");
		double salario3 = teclado.nextDouble();
		
		double mediaSalarial = (salario1+salario2+salario3)/3;
		System.out.printf("O sal�rio m�dio da empresa � R$%.2f ",mediaSalarial);
		
		
		teclado.close();
	}

}
