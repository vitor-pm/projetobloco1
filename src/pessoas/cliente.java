package pessoas;

import java.util.Scanner;

public class cliente extends pessoa {

	private int numPedidos;

	public int getNumPedidos() {
		return numPedidos;
	}

	public void setNumPedidos(int numPedidos) {
		this.numPedidos = numPedidos;
	}
	
	public cliente(int id, String nome, String telefone, String endereco, int pedidos) {
		super.setId(id);
		super.setNome(nome);
		super.setTelefone(telefone);
		super.setEndereco(endereco);
		this.setNumPedidos(pedidos);
	}
	
	public cliente(Scanner sc) {
		System.out.printf("\nDigite o id: ");
		super.setId(Integer.parseInt(sc.nextLine()));
		System.out.printf("\nDigite o nome: ");
		super.setNome(sc.nextLine());
		System.out.printf("\nDigite o telefone: ");
		super.setTelefone(sc.nextLine());
		System.out.printf("\nDigite o endereço: ");
		super.setEndereco(sc.nextLine());
		System.out.printf("\nDigite o N° pedidos: ");
		this.setNumPedidos(Integer.parseInt(sc.nextLine()));
	}

	public String toString() {
		return "Id: "+this.getId()+" | Nome: " + super.getNome() + " | Telefone: " + super.getTelefone() + " | Endereço: "
				+ super.getEndereco() + "| N° Pedidos: "+this.getNumPedidos();
	}

}
