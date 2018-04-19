package sge;

import java.util.GregorianCalendar;

public class Usuario {
	protected String nombre;
	protected String apellido;	
	protected String domicilio;
	protected GregorianCalendar fechaAlta;
	protected Integer userId;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}
	
	public void setFechaAlta(Integer unAnio, Integer unMes, Integer unDia, Integer unaHora, Integer unMinuto,
			Integer unSegundo) {
		this.fechaAlta = new GregorianCalendar();
		this.fechaAlta.set(unAnio, unMes, unDia, unaHora, unMinuto, unSegundo);
	}
	
	public void setSystemId(Integer userId) {
		this.userId = userId;
	}

	public Integer getUserId() {
		return this.userId;
	}

}
