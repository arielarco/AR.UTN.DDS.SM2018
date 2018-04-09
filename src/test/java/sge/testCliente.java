package sge;

import org.junit.*;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

public class testCliente {
	Cliente unCliente;
		
	@Before
	public void init() {
		this.unCliente = new Cliente();
		this.unCliente.setNombre("Pepe");
	
	}

	@Test
	public void testAlgunoEncendido() {
		ArrayList <Dispositivo> auxDispositivos;
		auxDispositivos = new ArrayList<Dispositivo>();
		auxDispositivos.add(new Dispositivo("TV",1));
		auxDispositivos.add(new Dispositivo("Heladera",2));
		auxDispositivos.add(new Dispositivo("Plancha",3));
		
		auxDispositivos.get(0).setEstaEncendido(true);
		auxDispositivos.get(1).setEstaEncendido(false);
		
		this.unCliente.setDispositivos(auxDispositivos);
		
		Assert.assertEquals(1, this.unCliente.CantidadEncendidos(), 0.01);
		assertTrue (this.unCliente.AlgunoEncendido());
	}
	
	
	@Test
	public void testCantidadApagados() {
		ArrayList <Dispositivo> auxDispositivos;
		auxDispositivos = new ArrayList<Dispositivo>();
		auxDispositivos.add(new Dispositivo("TV",1));
		auxDispositivos.add(new Dispositivo("Heladera",2));
		auxDispositivos.add(new Dispositivo("Plancha",3));
		
		auxDispositivos.get(0).setEstaEncendido(false);
		auxDispositivos.get(1).setEstaEncendido(false);
		auxDispositivos.get(2).setEstaEncendido(false);
		
		this.unCliente.setDispositivos(auxDispositivos);
		
		Assert.assertEquals(3, this.unCliente.CantidadApagados(), 0.01);
	}
	
	
}
