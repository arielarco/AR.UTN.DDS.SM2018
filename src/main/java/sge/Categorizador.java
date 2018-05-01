package sge;

import java.util.ArrayList;

public class Categorizador {

	private ArrayList<Categoria> categorias;

	public Categorizador() {
		super();
		this.categorias = new ArrayList<Categoria>();
	}

	public void addCategoria(Categoria unaCategoria) {
		this.categorias.add(unaCategoria);
	}

	public Categoria categorizarCliente(Cliente unCliente) {

		double consumoTotal = 0;
		double consumoInferior;
		double consumoSuperior;

		ArrayList<Dispositivo> dispositivos;

		dispositivos = unCliente.getDispositivos();

		for (int i = 0; i < dispositivos.size(); ++i) {

			consumoTotal += dispositivos.get(i).getConsumo();

		}

		for (int i = 0; i < this.categorias.size(); ++i) {
			consumoInferior = this.categorias.get(i).getConsumoInferior();
			consumoSuperior = this.categorias.get(i).getConsumoSuperior();
			
			
			if (consumoInferior < consumoTotal && consumoTotal <= consumoSuperior) {
				return this.categorias.get(i);
			}
		}

		return null;

	};

}
