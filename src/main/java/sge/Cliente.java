package sge;

import java.util.ArrayList;
import java.util.Date;

public class Cliente extends Usuario {

	private Documento documento;
	private Integer telefono;
	private Date fechaAlta;
	private Categoria categoria;

	private ArrayList<Dispositivo> dispositivos;

	/********************************************/

	public Documento getDocumento() {
		return documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public ArrayList<Dispositivo> getDispositivos() {
		return dispositivos;
	}

	public void setDispositivos(ArrayList<Dispositivo> dispositivos) {
		this.dispositivos = dispositivos;
	}

	public ArrayList<Dispositivo> estadoDispositivos(boolean estado) {
		ArrayList<Dispositivo> auxDispositivos;
		auxDispositivos = new ArrayList<Dispositivo>();
		
		for (int i = 0; i < this.dispositivos.size(); ++i) {
		    if (estado == this.dispositivos.get(i).estaEncendido()) {
		    	auxDispositivos.add(this.dispositivos.get(i));	
		    }
		}
		
		return auxDispositivos;
	}

	// Saber si alguno de sus dispositivos esta encendido
	public boolean algunoEncendido() {
		return (this.estadoDispositivos(true).size() > 0);
	}

	// Saber la cantidad de dispositivos encendidos
	public Integer cantidadEncendidos() {
		return this.estadoDispositivos(true).size();
	}

	// Saber la cantidad de dispositivos apagados
	public Integer cantidadApagados() {
		return this.estadoDispositivos(false).size();
	}

	// Informar la cantidad total de dispositivos que posee
	public Integer cantidadDispositivos() {
		return this.dispositivos.size();
	}
	
	public void agregarDispositivo(Dispositivo dispositivo) {
		this.getDispositivos().add(dispositivo);
		
	}

}
