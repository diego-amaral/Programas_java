package atividade03;

import java.util.Scanner;

public class Carro3 {
	private String modelo;
	private int ano;
	private String cor;
	private String marca;

	Scanner teclado = new Scanner(System.in);

	Carro3(String modelo, String marca, String cor, int ano) {
		this.modelo = modelo;
		this.marca = marca;
		this.cor = cor;
		this.ano = ano;

	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void cadastroInfo() {
		System.out.println("Digite o modelo do veículo: ");
		String modelo = teclado.nextLine();
		setModelo(modelo);

		System.out.println("Digite a cor do veículo: ");
		String cor = teclado.next();
		setCor(cor);

		System.out.println("Digite a marca do veículo: ");
		String marca = teclado.next();
		setMarca(marca);

		System.out.println("Digite o ano do veículo: ");
		int ano = teclado.nextInt();
		setAno(ano);
	}
	public void info() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Carro3 [modelo=" + getModelo() + ", ano=" + getAno() + ", cor=" + getCor() + ", marca=" + getMarca() + "]";
	}

}
