package pedido;

import pessoas.*;
import produtos.*;
import java.util.ArrayList;
import java.util.Scanner;

public class pedido {
	private int pedido;
	private float valorTotal;
	private funcionario func;
	private cliente cli;
	ArrayList<sorvetes> sorvetes;
	ArrayList<acompanhamentos> acompanhamentos;

	public int getPedido() {
		return pedido;
	}

	public void setPedido(int pedido) {
		this.pedido = pedido;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public funcionario getFunc() {
		return func;
	}

	public void setFunc(funcionario func) {
		this.func = func;
	}

	public cliente getCli() {
		return cli;
	}

	public void setCli(cliente cli) {
		this.cli = cli;
	}

	public ArrayList<sorvetes> getSorvetes() {
		return sorvetes;
	}

	public void setSorvetes(ArrayList<sorvetes> sorvetes) {
		this.sorvetes = sorvetes;
	}

	public ArrayList<acompanhamentos> getAcompanhamentos() {
		return acompanhamentos;
	}

	public void setAcompanhamentos(ArrayList<acompanhamentos> acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}

	public pedido(int pedido, int cli, int fun, ArrayList<sorvetes> sorvetes,
			ArrayList<acompanhamentos> acompanhamentos, ArrayList<cliente> clientes,
			ArrayList<funcionario> funcionario) {
		for (funcionario funcionario2 : funcionario) {
			if (funcionario2.getId() == fun) {
				this.setFunc(funcionario2);
			}
		}
		for (cliente cliente2 : clientes) {
			if (cliente2.getId() == cli) {
				this.setCli(cliente2);
			}
		}
		
		ArrayList<sorvetes> sorvEsc = new ArrayList<>();
		sorvEsc = definirSorvetes(sorvetes);
		
		ArrayList<acompanhamentos> acompEsc = new ArrayList<>();
		acompEsc = definirAcomps(acompanhamentos);

		float valorSorv = 0;

		for (sorvetes sorv : sorvEsc) {
			valorSorv = valorSorv + sorv.getValor();
		}
		
		float valorAcomp = 0;
		for (acompanhamentos acom : acompEsc) {
			valorAcomp = valorAcomp + acom.getValor();
		}
		
		float valor= valorAcomp +valorSorv;

		this.setValorTotal(valor);
		this.setPedido(pedido);

	}

	private ArrayList<sorvetes> definirSorvetes(ArrayList<sorvetes> sorvetes) {
		Scanner sc = new Scanner(System.in);
		int continuar = 0, quantidade = 0;
		int idSorv = 0;
		ArrayList<sorvetes> sorvEsc = new ArrayList<>();
		for (int j = 0; j < sorvetes.size(); j++) {
			System.out.println((j + 1) + " - " + sorvetes.get(j));
		}
		System.out.println("\nDigite o numero do sorvete que deseja adcionar:");
		idSorv = Integer.parseInt(sc.nextLine());
		System.out.println("Quantas unidades: ");
		quantidade = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < sorvetes.size(); j++) {
			if ((idSorv-1) == j) {
				for (int i = 0; i < quantidade; i++) {
					sorvEsc.add(sorvetes.get(j));
				}
			}
		}

		return sorvEsc;

	}
	
	private ArrayList<acompanhamentos> definirAcomps(ArrayList<acompanhamentos> acomps) {
		Scanner sc = new Scanner(System.in);
		int continuar = 0, quantidade = 0;
		int idAcomp;
		ArrayList<acompanhamentos> acompsEsc = new ArrayList<>();
		for (int j = 0; j < acomps.size(); j++) {
			System.out.println((j + 1) + " - " + acomps.get(j));
		}
		System.out.println("Digite o numero do acompanhamento que deseja adcionar:");
		idAcomp = Integer.parseInt(sc.nextLine());
		System.out.println("Quantas unidades: ");
		quantidade = Integer.parseInt(sc.nextLine());
		for (int j = 0; j < acomps.size(); j++) {
			if ((idAcomp-1) == j) {
				for (int i = 0; i < quantidade; i++) {
					acompsEsc.add(acomps.get(j));
				}
			}
		}

		return acompsEsc;

	}

	public String toString() {
		return "Func: " + this.getFunc().getNome() + " | Cliente: " + this.getCli().getNome() + " | Valor: "
				+ this.getValorTotal();

	}

}
