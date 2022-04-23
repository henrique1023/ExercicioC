package model;

public class FuncionarioTempoParcial extends Funcionario{
	
	private Double horaEntrada;
	private Double horaSaida;
	
	public FuncionarioTempoParcial() {
		super();
	}

	public FuncionarioTempoParcial(String id, String nome, Double salario, Double horaEntrada, Double horaSaida) {
		super(id, nome, salario);
		this.horaEntrada = horaEntrada;
		this.horaSaida = horaSaida;
	}

	public Double getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Double horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Double getHoraSaida() {
		return horaSaida;
	}

	public void setHoraSaida(Double horaSaida) {
		this.horaSaida = horaSaida;
	}

	@Override
	public String toString() {
		return "FuncionarioTempoParcial [horaEntrada=" + horaEntrada + ", horaSaida=" + horaSaida + "]";
	}
	
	
}
