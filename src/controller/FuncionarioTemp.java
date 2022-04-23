package controller;

import model.Funcionario;
import model.FuncionarioTemporario;

public class FuncionarioTemp extends FuncionarioController {

	@Override
	public Funcionario inicializaFuncionario(Funcionario f) {
		if (f != null) {
			int idI = (int) ((Math.random() * 1001) + 2000);
			String id = "" + idI;
			String nome = f.getNome();
			Double sala = f.getSalario();
			Integer dia = (int) ((Math.random() * 1) + 30);
			Integer mes = (int) ((Math.random() * 1) + 11);
			Integer ano = (int) ((Math.random() * 1) + 2);
			FuncionarioTemporario func = new FuncionarioTemporario(id, nome, sala, dia, mes, ano);
			return func;
		}
		return null;
	}

}
