package sge;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CategorizadorTest {

	Categorizador unCategorizador;

	@Before
	public void init() {
		this.unCategorizador = new Categorizador();
		this.unCategorizador.addCategoria(new Categoria("R1", 0, 150, 18.76, 0.644));
		this.unCategorizador.addCategoria(new Categoria("R2", 150, 325, 35.32, 0.644));
		this.unCategorizador.addCategoria(new Categoria("R3", 325, 400, 60.71, 0.681));
		this.unCategorizador.addCategoria(new Categoria("R4", 400, 450, 71.74, 0.738));
		this.unCategorizador.addCategoria(new Categoria("R5", 450, 500, 110.38, 0.794));
		this.unCategorizador.addCategoria(new Categoria("R6", 500, 600, 220.75, 0.832));
		this.unCategorizador.addCategoria(new Categoria("R7", 600, 700, 443.59, 0.851));
		this.unCategorizador.addCategoria(new Categoria("R8", 700, 1400, 545.96, 0.851));
		this.unCategorizador.addCategoria(new Categoria("R9", 1400, Double.MAX_VALUE, 887.19, 0.851));
	}

	@Test
	public void tstCategorizarCliente() throws InterruptedException {
		Categoria unaCategoria;
		Cliente unCliente = new Cliente("Pepe", "Dominguez");

		ArrayList<Dispositivo> auxDispositivos;

		auxDispositivos = new ArrayList<Dispositivo>();
		auxDispositivos.add(new Dispositivo("CentralNuclear", 1401));

		auxDispositivos.get(0).setTiempEncendido(1);
		System.out.println("Consumo = " + auxDispositivos.get(0).getConsumo());		
		unCliente.setDispositivos(auxDispositivos);		
		unaCategoria = this.unCategorizador.categorizarCliente(unCliente);
		System.out.println("Categoria: " + unaCategoria.getDescripcion() );
		Assert.assertTrue(unaCategoria.getDescripcion() == "R9");
	
	}

}
