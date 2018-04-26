package sge;

import sge.Cliente;

public class Categoria {
	
	private Integer consumoInferior;
	private Integer consumoSuperior;
	private Double cargoFijo;
	private Double cargoVariable;
	private Object tipoCategoria;
		
	public Categoria(Integer consInf, Integer consSup, Double _cargoFijo, Double _cargoVariable) {
		
		consumoInferior = consInf;
		consumoSuperior = consSup;
		cargoFijo = _cargoFijo;
		cargoVariable = _cargoVariable;
	}
	
	Categoria r1 = new Categoria(0, 150, 18.76, 0.644);
	Categoria r2 = new Categoria(151, 325, 35.32, 0.644);
	Categoria r3 = new Categoria(326, 400, 60.71, 0.681);
	Categoria r4 = new Categoria(401, 450, 71.74, 0.738);
	Categoria r5 = new Categoria(451, 500, 110.38, 0.794);
	Categoria r6 = new Categoria(501, 600, 220.75, 0.832);
	Categoria r7 = new Categoria(601, 700, 443.59, 0.851);
	Categoria r8 = new Categoria(701, 1400, 545.96, 0.851);
	Categoria r9 = new Categoria(1401, 9999 , 887.19, 0.851);
	
}
