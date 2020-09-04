package view;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {
		OperacoesController op = new OperacoesController();
		
		op.Concatena100Numeros();
		op.Concatena1000Numeros();
		op.Concatena10000Numeros();
		
	}

}
