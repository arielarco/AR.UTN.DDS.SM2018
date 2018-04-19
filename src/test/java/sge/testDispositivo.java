package sge;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.*;
public class testDispositivo {
	Dispositivo unDispositivo;
	
	@Before
	public void init() {
		this.unDispositivo = new Dispositivo("Heladera",10);
	}
	
	@Test
	public void testGetAlgunoEncendido() throws InterruptedException {
		this.unDispositivo.encender();
		TimeUnit.SECONDS.sleep(4);
		this.unDispositivo.apagar();
		Assert.assertEquals(4, this.unDispositivo.getTiempoEncendido(),0.1);
	}
	
}
