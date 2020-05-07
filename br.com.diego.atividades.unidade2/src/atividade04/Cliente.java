package atividade04;

import java.util.Scanner;

public class Cliente {
	Scanner teclado = new Scanner(System.in);
	
	private String nome;
	private String cpf;
	private int idade;
	private String endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void pegandoInfo() {
		System.out.println("Digite o nome");
		String nome = teclado.nextLine();
		setNome(nome);

		System.out.println("Digite o cpf");
		String cpf = teclado.nextLine();
		setCpf(cpf);

		System.out.println("Digite o endereço");
		String endereco = teclado.nextLine();
		setEndereco(endereco);

		System.out.println("Digite a idade");
		int idade = teclado.nextInt();
		setIdade(idade);
		
		teclado.close();
	}
	void exibeInfo() {
		System.out.printf("Nome: %s\ncpf: %s\nidade: %d anos\nendereço: %s", getNome(), getCpf(),
				getIdade(), getEndereco());
	}
}
