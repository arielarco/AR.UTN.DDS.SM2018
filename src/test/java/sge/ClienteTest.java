package sge;

import org.junit.*;

import sge.Cliente;
import sge.Dispositivo;

import java.util.ArrayList;

public class ClienteTest {
	Cliente unCliente;
	Cliente otroCliente;
	Cliente nuevoCliente;
	Dispositivo heladera = new Dispositivo("Heladera", 200);
	Dispositivo televisor = new Dispositivo("TV", 100);
	Dispositivo plancha = new Dispositivo("Plancha", 30);
	Dispositivo playstation = new Dispositivo("PS4", 200);
	Dispositivo lampLava = new Dispositivo("Lámpara de Lava", 25);
	Dispositivo lavadora = new Dispositivo("Lavadora", 125);	
	Dispositivo afeitadora = new Dispositivo("Afeitadora Eléctrica", 55);
	Dispositivo microo = new Dispositivo("Microondas", 82);
		
	@Before
	public void init() {
			
		this.unCliente = new Cliente("Pepe", "Dominguez");
		this.otroCliente = new Cliente("Carlos", " ");
		this.nuevoCliente = new Cliente("Julio", " ");
		
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
		
		Assert.assertTrue(this.unCliente.getAlgunoEncendido());
	}
	
	@Test
	public void cantidadDeDispositivosEncendidos() {
		ArrayList <Dispositivo> listaDispositivos;
		listaDispositivos = new ArrayList<Dispositivo>();
		listaDispositivos.add(playstation);
		listaDispositivos.add(lampLava);
		listaDispositivos.add(lavadora);
		listaDispositivos.add(afeitadora);
		
		listaDispositivos.get(0).encender();
		listaDispositivos.get(2).encender();
		listaDispositivos.get(3).encender();
		
		this.otroCliente.setDispositivos(listaDispositivos);
		
		Assert.assertEquals(3, this.otroCliente.getCantidadEncendidos(), 1);
		
		}
	
	@Test
	public void cantidadDeDispositivosApagados() {
		ArrayList <Dispositivo> auxDispositivos;
		auxDispositivos = new ArrayList<Dispositivo>();
		auxDispositivos.add(televisor);
		auxDispositivos.add(heladera);
		auxDispositivos.add(plancha);
		
		auxDispositivos.get(1).encender();
		auxDispositivos.get(2).encender();
		auxDispositivos.get(1).apagar();
		
		this.nuevoCliente.setDispositivos(auxDispositivos);
		
		Assert.assertEquals(2, this.nuevoCliente.getCantidadApagados(), 1);
		
		}
	
	@Test
	public void conocerCantidadDeDispositivos() {
		ArrayList <Dispositivo> listadoDeDispositivos;
		listadoDeDispositivos = new ArrayList<Dispositivo>();
		listadoDeDispositivos.add(playstation);
		listadoDeDispositivos.add(lampLava);
		listadoDeDispositivos.add(plancha);
		listadoDeDispositivos.add(microo);
		
		this.unCliente.setDispositivos(listadoDeDispositivos);
		
		Assert.assertEquals(4, this.unCliente.getCantidadDispositivos(), 1);
		System.out.println("La cantidad de Dispositivos que posee son: " + listadoDeDispositivos.size() );
	}
}
