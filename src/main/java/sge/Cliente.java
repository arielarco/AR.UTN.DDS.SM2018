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

	public ArrayList<Dispositivo> getDispositivos(boolean estaEncendido) {
		ArrayList<Dispositivo> auxDispositivos;
		auxDispositivos = new ArrayList<Dispositivo>();
		
		for (int i = 0; i < this.dispositivos.size(); ++i) {
		    if ( this.dispositivos.get(i).estaEncendido()) {
		    	auxDispositivos.add(this.dispositivos.get(i));
		    }
		}
		
		return auxDispositivos;
	}

	// Saber si alguno de sus dispositivos está encendido
	public boolean getAlgunoEncendido() {
		return (this.getDispositivos(true).size() > 0);
	}

	// Saber la cantidad de dispositivos encendidos
	public Integer getCantidadEncendidos() {
		return this.getDispositivos(true).size();
	}

	// Saber la cantidad de dispositivos apagados
	public Integer getCantidadApagados() {
		return this.getDispositivos(false).size();
	}

	// Informar la cantidad total de dispositivos que posee
	public Integer getCantidadDispositivos() {
		return this.dispositivos.size();
	}

}
