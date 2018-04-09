package sge;

import org.junit.*;

import java.util.ArrayList;
import java.util.Calendar;

public class testCliente {
	Cliente unCliente;
		
	@Before
	public void init() {
		this.unCliente = new Cliente();
		this.unCliente.setNombre("Pepe");
	}

	@Test
	public void testGetAlgunoEncendido() {
		ArrayList <Dispositivo> auxDispositivos;
		auxDispositivos = new ArrayList<Dispositivo>();
		auxDispositivos.add(new Dispositivo("TV",1));
		auxDispositivos.add(new Dispositivo("Heladera",2));
		auxDispositivos.add(new Dispositivo("Plancha",3));
		
		auxDispositivos.get(0).setEstaEncendido(true);
		auxDispositivos.get(1).setEstaEncendido(true);
		
		this.unCliente.setDispositivos(auxDispositivos);
		
		Assert.assertEquals(2, this.unCliente.getCantidadEncendidos(), 0.01);
	}
	
	
	@Test
	public void testGetCantidadApagados() {
		ArrayList <Dispositivo> auxDispositivos;
		auxDispositivos = new ArrayList<Dispositivo>();
		auxDispositivos.add(new Dispositivo("TV",1));
		auxDispositivos.add(new Dispositivo("Heladera",2));
		auxDispositivos.add(new Dispositivo("Plancha",3));
		
		auxDispositivos.get(0).setEstaEncendido(false);
		auxDispositivos.get(1).setEstaEncendido(false);
		
		this.unCliente.setDispositivos(auxDispositivos);
		
		Assert.assertEquals(2, this.unCliente.getCantidadApagados(), 0.01);
	}
	
	
}
