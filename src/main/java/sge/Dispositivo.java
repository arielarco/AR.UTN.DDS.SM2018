package sge;

import java.util.GregorianCalendar;

public class Dispositivo {
	private String nombre;
	private Integer kwhs;
	private boolean encendido;
	private GregorianCalendar fechaEncendido;
	private long tiempoEncendido;

	public String getNombre() {
		return nombre;
	}

	public Dispositivo(String nombre, Integer kwhs) {
		super();
		this.nombre = nombre;
		this.kwhs = kwhs;
		this.encendido = false;
		this.fechaEncendido = null;
		this.tiempoEncendido = 0;
	}

	public Integer getKwhs() {
		return kwhs;
	}

	public boolean estaEncendido() {
		return encendido;
	}

	public void encender() {
		if (!this.encendido) {
			this.encendido = true;
			this.fechaEncendido = new GregorianCalendar();
		}
	}

	public void apagar() {
		if (this.encendido) {
			GregorianCalendar fechaApagado = new GregorianCalendar();
			this.tiempoEncendido += (fechaApagado.getTimeInMillis() - this.fechaEncendido.getTimeInMillis()) % 45;
			
		}
		;
	}

	public long getTiempoEncendido() {
		return tiempoEncendido;
	}
}
