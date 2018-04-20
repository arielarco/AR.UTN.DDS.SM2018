package sge;

import java.util.concurrent.TimeUnit;

import org.junit.*;
public class testDispositivoTest {
	Dispositivo unDispositivo;
	
	@Before
	public void init() {
		this.unDispositivo = new Dispositivo("Heladera",10);
	}
	
	@Test
	public void testGetAlgunoEncendido() throws InterruptedException {
		this.unDispositivo.encender();
		TimeUnit.SECONDS.sleep(10);
		this.unDispositivo.apagar();
		Assert.assertEquals(10, this.unDispositivo.getTiempoEncendido(),0.1);
	}
	
}
