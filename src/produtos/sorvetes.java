package produtos;

import java.util.Scanner;

public class sorvetes {

	private String sabor;
	private String tipo;
	private float valor;
	private String marca;
	private String tamanho;

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Sabor: " + this.getSabor() + "| Tipo: " + this.getTipo() + " | Valor: " + this.getValor() + " | Marca"
				+ this.getMarca() + " | Tamanho: " + this.getTamanho();
	}

	public sorvetes(String sabor, String tipo, float valor, String marca, String tamanho) {
		super();
		this.setSabor(sabor);
		this.setTipo(tipo);
		this.setValor(valor);
		this.setMarca(marca);
		this.setTamanho(tamanho);
	}
	
	public sorvetes(Scanner scan) {
		System.out.print("\nDigite o sabor: ");
		this.setSabor(scan.next());
		System.out.print("\nDigite o Tipo: ");
		this.setTipo(scan.next());
		System.out.print("\nDigite o valor: ");
		this.setValor(scan.nextFloat());
		System.out.print("\nDigite a marca: ");
		this.setMarca(scan.next());
		System.out.print("\nDigite o tamanho: ");
		this.setTamanho(scan.next());
	}

}
