package controller;

import model.Funcionario;
import model.FuncionarioTempoParcial;

public class FuncionarioParcial extends FuncionarioController{

	@Override
	public Funcionario inicializaFuncionario(Funcionario func) {
		if(func != null) {
			Double horaEntrada = (double)((Math.random() * 1) + 12);
			Double horaSaida = (double)((Math.random() * 15) + 22);
			Funcionario funcPar = new FuncionarioTempoParcial(func.getId(), func.getNome(), func.getSalario(),
					horaEntrada, horaSaida);
			return funcPar;
		}
		return null;
	}

}
