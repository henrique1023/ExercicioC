package model;

public class Estagiario extends Funcionario{
	
	private String institutoParceiro;
	
	

	public Estagiario(String id, String nome, Double salario, String institutoParceiro) {
		super(id, nome, salario);
		this.institutoParceiro = institutoParceiro;
	}

	public String getInstitutoParceiro() {
		return institutoParceiro;
	}

	public void setInstitutoParceiro(String institutoParceiro) {
		this.institutoParceiro = institutoParceiro;
	}

	@Override
	public String toString() {
		return "Estagiario [institutoParceiro=" + institutoParceiro + "]";
	}
	
	
}
