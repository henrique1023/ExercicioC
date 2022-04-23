package controller;

import model.Estagiario;
import model.Funcionario;

public class FuncionarioEstagio extends FuncionarioController{

	@Override
	public Funcionario inicializaFuncionario(Funcionario func) {
		if (func != null) {
			String Empresa = "Exemp";
			Funcionario esta = new Estagiario(func.getId(), func.getNome(), func.getSalario(), Empresa);
			return esta;
		}
		return null;
	}

}
