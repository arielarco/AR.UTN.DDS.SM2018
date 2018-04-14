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
		ArrayList <Dispositivo> auxDispositivos;
		auxDispositivos = new ArrayList<Dispositivo>();
		auxDispositivos.add(new Dispositivo("TV",1));
		auxDispositivos.add(new Dispositivo("Heladera",2));
		auxDispositivos.add(new Dispositivo("Plancha",3));
		this.unCliente.setDispositivos(auxDispositivos);
	
	}

	@Test
	public void testAlgunoEncendido() {
		ArrayList <Dispositivo> dispositivos = this.unCliente.getDispositivos();
		
		dispositivos.get(0).setEstaEncendido(true);
		dispositivos.get(1).setEstaEncendido(false);
		dispositivos.get(2).setEstaEncendido(true);
		
		Assert.assertEquals(2, this.unCliente.cantidadEncendidos(), 0.01);
		assertTrue (this.unCliente.algunoEncendido());
	}
	
	
	@Test
	public void testCantidadApagados() {
		ArrayList <Dispositivo> dispositivos = this.unCliente.getDispositivos();
		
		dispositivos.get(0).setEstaEncendido(false);
		dispositivos.get(1).setEstaEncendido(false);
		dispositivos.get(2).setEstaEncendido(false);
		
		Assert.assertEquals(3, this.unCliente.cantidadApagados(), 0.01);
	}
	
	@Test
	public void testAgregarDispositivos() {
		Assert.assertEquals(3, this.unCliente.cantidadDispositivos(), 0.01);
		
		this.unCliente.agregarDispositivo(new Dispositivo("Ventilador",4));
		
		Assert.assertEquals(4, this.unCliente.cantidadDispositivos(), 0.01);
	}
	
	
}
