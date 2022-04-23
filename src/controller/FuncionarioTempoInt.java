package controller;

import model.Funcionario;
import model.FuncionarioTempoIntegral;

public class FuncionarioTempoInt extends FuncionarioController{

	@Override
	public Funcionario inicializaFuncionario(Funcionario func) {
		if(func != null) {
			Integer bancoHoras = (int)((Math.random() * 1) + 100);
			Funcionario funcInt = new FuncionarioTempoIntegral(func.getId(), func.getNome(), func.getSalario(), bancoHoras);
			return funcInt;
		}
		return null;
	}

}
