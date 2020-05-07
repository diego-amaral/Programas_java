package atividade05;

import java.util.Scanner;

public class Conta {
	Scanner teclado = new Scanner(System.in);

	private String nomeTitular;
	private String numConta;
	private double saldo = 0;

	public Conta(String nomeTitular, String numConta) {
		this.nomeTitular = nomeTitular;
		this.numConta = numConta;
	}

	public String getNumConta() {
		return numConta;
	}

	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public String deposita(double valor) {
		System.out.println("Informe o valor do deposito R$");
		valor = teclado.nextDouble();
		if (valor > 0) {

			this.saldo += valor;
			return "Deposito realizado!";

		} else {
			return "Falha! Não é possível depositar";
		}
	}

	@Override
	public String toString() {
		return "Conta -->" + numConta + "[nomeTitular=" + nomeTitular + ", saldo-R$" + saldo + "]";
	}

	public String sacar(double valor) {
		System.out.println("Informe o valor do saque R$");
		valor = teclado.nextDouble();
		if (valor > 0) {
			if (this.saldo >= valor) {

				this.saldo -= valor;
				return "Saque realizado com sucesso!";

			} else {

				return "Não foi possivel sacar";
			}
		} else {

			return "Saldo negativo";
		}
	}

	public String confereSaldo() {
		if (this.saldo != 0) {
			
			System.out.printf(toString());
			return "--> [Você tem Saldo]";
			
		} else {

			return "--> Você não tem saldo";
		}

	}

	public String transfere(double valor, Conta cont2) {
		System.out.println("\nInforme quanto você quer transferir R$");
		valor = teclado.nextDouble();
		if (valor > 0) {
			if (cont2 != null) {
				
				cont2.saldo += valor;
				return "Transferencia efetuada com sucesso!";
				
			} else {

				return "Conta que será tranferida esta nulo";
			}

		}

		return "Valor negativo";

	}
}
