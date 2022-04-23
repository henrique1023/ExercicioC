package model;

public class FuncionarioTemporario extends Funcionario{
	 private Integer dia;
	 private Integer mes;
	 private Integer ano;
	 
	public FuncionarioTemporario() {
	}
	public FuncionarioTemporario(String id, String nome, Double salario, Integer dia, Integer mes, Integer ano) {
		super(id, nome, salario);
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public Integer getDia() {
		return dia;
	}
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	public Integer getMes() {
		return mes;
	}
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	@Override
	public String toString() {
		return "FuncionarioTemporario [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	 
	 
}
