package sorveteriaMenu;

import pessoas.*;
import produtos.*;
import java.util.ArrayList;
import java.util.Scanner;

import pedido.pedido;

public class SorveteriaMenu {

	public static void main(String[] args) {

		int menu = 0, voltar = 0;

		ArrayList<cliente> clientes = new ArrayList<>();
		clientes = gerarCli();
		ArrayList<funcionario> funcionarios = new ArrayList<>();
		funcionarios = gerarFunc();
		ArrayList<sorvetes> sorvetes = new ArrayList<>();
		sorvetes = gerarSorvetes();
		ArrayList<acompanhamentos> acomp = new ArrayList<>();
		acomp = gerarAcomp();
		ArrayList<pedido> pedidos = new ArrayList<>();

		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("\nBem Vindo a sorveteria da Turma 45.");
			System.out.println("1 - Ver/Inserir Funcionarios.");
			System.out.println("2 - Ver/Inserir Clientes.");
			System.out.println("3 - Ver/Inserir Sorvetes.");
			System.out.println("4 - Ver/Inserir Acompanhamentos.");
			System.out.println("5 - Executar Pedido.");
			System.out.printf("Insira o numero da opçao:");
			menu = Integer.parseInt(scan.nextLine());

			switch (menu) {
			case 1:
				System.out.println("\n-----------------------------------------------* Funcionarios *-----------------------------------------------");
				for (funcionario func : funcionarios) {
					System.out.println(func);
				}
				System.out.println("-----------------------------------------------* Funcionarios *-----------------------------------------------\n");

				System.out.println("1 - Inserir Funcionario \n2 - Voltar");
				voltar = Integer.parseInt(scan.nextLine());
				
				while (voltar == 1) {
					funcionario fun = new funcionario(scan);
					funcionarios.add(fun);
					System.out.println("\nInserir outro funcionario? \n1 - Sim \n2 - Não");
					voltar = Integer.parseInt(scan.nextLine());
				}
				menu = 0;

				break;
			case 2:
				System.out.println("\n-------------------------------------* Clientes *-------------------------------------");
				for (cliente cli : clientes) {
					System.out.println(cli);
				}
				System.out.println("-------------------------------------* Clientes *-------------------------------------\n");

				System.out.println("1 - Inserir Cliente \n2 - Voltar");
				voltar = Integer.parseInt(scan.nextLine());
				
				while (voltar == 1) {
					cliente cli = new cliente(scan);
					clientes.add(cli);
					System.out.println("\nInserir outro cliente? \n1 - Sim \n2 - Não");
					voltar = Integer.parseInt(scan.nextLine());
				}

				menu = 0;

				break;
			case 3:
				System.out.println("\n-------------------------------------* Sorvetes *-------------------------------------");
				for (sorvetes sorv : sorvetes) {
					System.out.println(sorv);
				}
				System.out.println("-------------------------------------* Sorvetes *-------------------------------------\n");

				System.out.println("1 - Inserir Sorvete \n2 - Voltar");
				voltar = Integer.parseInt(scan.nextLine());
				
				while (voltar == 1) {
					sorvetes sor = new sorvetes(scan);
					sorvetes.add(sor);
					System.out.println("\nInserir outro sorvetes? \n1 - Sim \n2 - Não");
					voltar = Integer.parseInt(scan.nextLine());
				}

				menu = 0;

				break;
			case 4:
				System.out.println("\n-------------------------------------* Acompanhamentos *-------------------------------------");
				for (acompanhamentos ac : acomp) {
					System.out.println(ac);
				}
				System.out.println("-------------------------------------* Acompanhamentos *-------------------------------------\n");
				
				System.out.println("1 - Inserir Acompanhamento \n2 - Voltar");
				voltar = Integer.parseInt(scan.nextLine());
				
				while (voltar == 1) {
					acompanhamentos ac = new acompanhamentos(scan);
					acomp.add(ac);
					System.out.println("\nInserir outro Acompanhamento? \n1 - Sim \n2 - Não");
					voltar = Integer.parseInt(scan.nextLine());
				}
				menu = 0;

				break;
			case 5:
				System.out.println("----------------------------------------- *Pedidos* -----------------------------------------");
				System.out.println("\nO que deseja fazer?");
				System.out.println("1 - Ver lista de pedidos.");
				System.out.println("2 - Fazer pedido.");
				System.out.println("3 - voltar.");
				voltar = Integer.parseInt(scan.nextLine());
				
				if (voltar == 1) {
					System.out.println(pedidos);
				}
				
				while (voltar == 2) {
					System.out.print("\nId do funcionario: ");
					int idFunc= Integer.parseInt(scan.nextLine());
					System.out.print("\nId do cliente: ");
					int idCli= Integer.parseInt(scan.nextLine());
					System.out.print("\nId do pedido: ");
					int idPed = Integer.parseInt(scan.nextLine());
					pedido ped = new pedido(idPed, idFunc, idCli, sorvetes, acomp, clientes, funcionarios);
					
					pedidos.add(ped);
					System.out.println(ped);
					
					System.out.println("1 - Voltar");
					System.out.println("2 - Fazer outro pedido.");
					voltar = Integer.parseInt(scan.nextLine());
					
				}
				
				menu = 0;
				break;

			default:
				System.out.println("OPÇÃO INVALIDA.");
				
				menu = 0;
				break;
			}

		} while (menu != 5);

	}

	public static ArrayList<funcionario> gerarFunc() {
		ArrayList<funcionario> funcionarios = new ArrayList<>();

		funcionario f1 = new funcionario(1, "Anderson", "123456789", "Atendente", "Rua Um", "4002-8922", 2000);
		funcionario f2 = new funcionario(2, "Fernanda", "987654321", "Gerente", "Rua Dois", "7070-7070", 4000);
		funcionarios.add(f1);
		funcionarios.add(f2);

		return funcionarios;
	}

	public static ArrayList<cliente> gerarCli() {
		ArrayList<cliente> clientes = new ArrayList<>();

		cliente c1 = new cliente(1, "Vitor", "4002-8922", "Rua Cindo", 2);
		cliente c2 = new cliente(2, "Amanda", "7845-1236", "Avenida do Estado", 5);
		clientes.add(c1);
		clientes.add(c2);

		return clientes;
	}

	public static ArrayList<sorvetes> gerarSorvetes() {
		ArrayList<sorvetes> sorvetes = new ArrayList<>();

		sorvetes s1 = new sorvetes("Morango", "Massa", 2, "Kibom", "Medio");
		sorvetes s2 = new sorvetes("Chocolate", "Massa", 1, "Kibom", "Pequeno");
		sorvetes s3 = new sorvetes("Flocos", "Picole", 5, "Zequinha", "Grande");
		sorvetes.add(s1);
		sorvetes.add(s2);
		sorvetes.add(s3);

		return sorvetes;
	}

	public static ArrayList<acompanhamentos> gerarAcomp() {
		ArrayList<acompanhamentos> acomps = new ArrayList<>();

		acompanhamentos a1 = new acompanhamentos("Castanha", "DuNorte", 0.50F);
		acompanhamentos a2 = new acompanhamentos("Granulado", "Arcor", 0.10F);
		acompanhamentos a3 = new acompanhamentos("Calda Morango", "Caldas & CiA", 0.10F);
		acomps.add(a1);
		acomps.add(a2);
		acomps.add(a3);

		return acomps;
	}
}
