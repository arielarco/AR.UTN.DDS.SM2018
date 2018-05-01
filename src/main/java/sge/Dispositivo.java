package sge;

import java.util.Date;
import java.util.GregorianCalendar;

public class Dispositivo {
	private String nombre;
	private Integer kwhs;
	private boolean encendido;
	private GregorianCalendar fechaEncendido;
	private long tiempoEncendido;
	private GregorianCalendar fechaApagado;
	
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
			this.encendido = false;
			this.fechaApagado = new GregorianCalendar();
			Date tiempoInicial = this.fechaEncendido.getTime();
			Date tiempoFinal = fechaApagado.getTime();
			this.tiempoEncendido += (tiempoFinal.getTime() - tiempoInicial.getTime()) / 1000;
		}
		;
	}

	public void setTiempEncendido(long unTiempoEncendido) {
		this.tiempoEncendido = unTiempoEncendido;
	}
	
	public long getTiempoEncendido() {
		return tiempoEncendido;
	}
	
	public double getConsumo() {
		return this.tiempoEncendido*this.getKwhs();
	}
	
}
