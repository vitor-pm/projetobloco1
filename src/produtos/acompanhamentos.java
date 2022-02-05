package produtos;

import java.util.Scanner;

public class acompanhamentos {
	private String nome;
	private String marca;
	private float valor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public acompanhamentos(String nome, String marca, float valor) {
		super();
		this.setNome(nome);
		this.setMarca(marca);
		this.setValor(valor);
	}

	public acompanhamentos(Scanner scan) {
		
		System.out.println("Digite o nome do acompanhamento: ");
		this.setNome(scan.nextLine());
		
		System.out.println("\nDigite a marca do acompanhamento: ");
		this.setMarca(scan.nextLine());
		
		System.out.println("\nDigite o valor do acompanhamento: ");
		this.setValor(Float.parseFloat(scan.nextLine()));
		
	}

	public String toString() {
		return "Nome: " + this.getNome() + " | Marca: " + this.getMarca() + " | Valor: " + this.getValor();
	}
}
