package model;

public class Funcionario {
	private String id;
	private String nome;
	private Double salario;
	
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(String id, String nome, Double salario) {
		super();
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", nome=" + nome + ", salario=" + salario + "]";
	}
	
}
