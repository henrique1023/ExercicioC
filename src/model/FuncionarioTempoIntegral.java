package model;

public class FuncionarioTempoIntegral extends Funcionario{
	
	private Integer bancoHoras;
	
	public FuncionarioTempoIntegral() {
		super();
	}

	public FuncionarioTempoIntegral(String id, String nome, Double salario, Integer bancoHoras) {
		super(id, nome, salario);
		this.bancoHoras = bancoHoras;
	}

	public Integer getBancoHoras() {
		return bancoHoras;
	}

	public void setBancoHoras(Integer bancoHoras) {
		this.bancoHoras = bancoHoras;
	}

	@Override
	public String toString() {
		return "FuncionarioTempoIntegral [bancoHoras=" + bancoHoras + "]";
	}
	
	
	
}
