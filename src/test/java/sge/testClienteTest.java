package sge;

import org.junit.*;

import java.util.ArrayList;


public class testClienteTest {
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
		
		auxDispositivos.get(0).encender();
		auxDispositivos.get(1).encender();
		
		this.unCliente.setDispositivos(auxDispositivos);
		
		Assert.assertEquals(2, this.unCliente.getCantidadEncendidos(), 0.01);
	}
}
