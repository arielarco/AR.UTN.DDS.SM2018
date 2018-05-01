package sge;

import org.junit.*;

public class AdministradorTest {
	Administrador unAdministrador;

	@Before
	public void init() {
		this.unAdministrador = new Administrador();
	}

	@Test
	public void testAdministradorGetSystemId() {
		this.unAdministrador.setSystemId(1);
		Assert.assertEquals(1, this.unAdministrador.getSystemId(),0.01);
	}
	
	@Test
	public void testAdministradorGetMesesComoAdministrador() {
		this.unAdministrador.setFechaAlta(2018, 1, 1, 0, 0, 0);
		Assert.assertEquals(3, this.unAdministrador.getMesesComoAdministrador(), 0.01);
	}
}
