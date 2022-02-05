package pessoas;

import java.util.Scanner;

public class funcionario extends pessoa {

	private float salario;
	private String cargo;
	private String cpf;

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public funcionario(int id, String nome, String cpf, String cargo, String endereco, String telefone,
			float salario) {
		super.setId(id);
		super.setNome(nome);
		this.setCpf(cpf);
		this.setCargo(cargo);
		super.setEndereco(endereco);
		super.setTelefone(telefone);
		this.setSalario(salario);
	}

	public String toString() {
		return "Id: " + this.getId() + " | Nome: " + super.getNome() + " | CPF: " + this.getCpf() + " | Cargo: "
				+ this.getCargo() + " | Telefone: " + super.getTelefone() + " | Endere�o: " + super.getEndereco()
				+ "| Salario:" + this.getSalario();
	}
	
	public funcionario(Scanner sc) {
		
		
		System.out.print("\nDigite o id: ");
		super.setId(sc.nextInt());
		
		System.out.print("\nDigite o nome: ");
		super.setNome(sc.next());
		
		System.out.print("\nDigite o CPF: ");
		this.setCpf(sc.next());
		
		System.out.print("\nDigite o Cargo: ");
		this.setCargo(sc.next());
		
		System.out.print("\nDigite o Telefone: ");
		super.setTelefone(sc.next());
		
		System.out.print("\nDigite o Endereco: ");
		super.setEndereco(sc.next());
		
		System.out.print("\nDigite o Salario: ");
		this.setSalario(sc.nextFloat());
		
		
		
		/*System.out.println("Digite o id: ");
		int id = scan.nextInt();
		System.out.println("Digite o nome: ");
		String nome = scan.next();
		System.out.println("Digite o CPF: ");
		String cpf = scan.next();
		System.out.println("Digite o Cargo: ");
		String cargo = scan.next();
		System.out.println("Digite o Telefone: ");
		String telefone = scan.next();
		System.out.println("Digite o Endereco: ");
		String endereco = scan.next();
		System.out.println("Digite o Salario: ");
		float salario = scan.nextFloat();*/
				
	}

}
