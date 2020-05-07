package atividade05;

public class Banco {

	private int maxContas;
	private Conta[] contas;
	static int numContas = 0;

	public Banco(int maxContas) {
		this.maxContas = maxContas;
		this.contas = new Conta[this.maxContas];
	}

	public Conta[] getContas() {
		return contas;
	}

	public void setContas(Conta[] contas) {
		this.contas = contas;
	}

	public static int getNumContas() {
		return numContas;
	}

	public static void setNumContas(int numContas) {
		Banco.numContas = numContas;
	}

	public void cadastrarConta(String nomeTitular, String numConta) {
		if (numContas < this.maxContas) {

			Conta c1 = new Conta(nomeTitular, numConta);
			this.contas[numContas] = c1;
			numContas++;

		} else {

			System.out.println("Limite de contas excedido");
		}
	}

	public void infoContas() {

		for (Conta conta : this.contas) {

			System.out.println(conta.toString());
		}
	}

	public void depositaConta() {

		for (Conta conta : this.contas) {

			System.out.println(conta.deposita(numContas));
		}
	}

	public void saqueConta() {

		for (Conta conta : this.contas) {

			System.out.println(conta.sacar(numContas));
		}
	}

	public void confereSaldoConta() {

		for (Conta conta : this.contas) {

			System.out.println(conta.confereSaldo());
		}
	}

	public void tranfereValor() {

		for (Conta conta : this.contas) {

			System.out.println(conta.transfere(numContas, conta));
		}
	}

	public void saldoTotal() {
		double total = 0;
		for (Conta conta : this.contas) {
			
			total += conta.getSaldo();
		}
		System.out.println("Valor totas das contas é R$" + total);
	}

	public void contasCriadas() {
		
		System.out.println("Total de contas criadas " + numContas);
	}

}
