package sge;

import sge.Cliente;

public class Categoria {

	private String descripcion;
	private double consumoInferior;
	private double consumoSuperior;
	private double cargoFijo;
	private double cargoVariable;
	
	public Categoria(String unaDescripcion, double unConsInf, double unConsSup, double unCargoFijo, double unCargoVariable) {

		descripcion = unaDescripcion;
		consumoInferior = unConsInf;
		consumoSuperior = unConsSup;
		cargoFijo = unCargoFijo;
		cargoVariable = unCargoVariable;
	}

	public double getConsumoInferior() {
		return this.consumoInferior;
	}

	public double getConsumoSuperior() {
		return this.consumoSuperior;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	
}
