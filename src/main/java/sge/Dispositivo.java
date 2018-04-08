package sge;

public class Dispositivo {
	private String nombre;
	private Integer kwhs;
	private boolean encendido;

	public String getNombre() {
		return nombre;
	}

	
	
	public Dispositivo(String nombre, Integer kwhs) {
		super();
		this.nombre = nombre;
		this.kwhs = kwhs;
		this.encendido= false;
	}



	public Integer getKwhs() {
		return kwhs;
	}

	public boolean estaEncendido() {
		return encendido;
	}

	public void setEstaEncendido(boolean estaEncendido) {
		this.encendido = estaEncendido;
	}
}
