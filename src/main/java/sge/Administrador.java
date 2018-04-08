package sge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Administrador extends Usuario {

	private GregorianCalendar fechaAlta;
	private Integer systemId;

	public GregorianCalendar getFechaAlta() {
		return fechaAlta;
	}

	
	public void setFechaAlta(Integer unAnio, Integer unMes, Integer unDia, Integer unaHora, Integer unMinuto,
			Integer unSegundo) {
		this.fechaAlta = new GregorianCalendar();
		this.fechaAlta.set(unAnio, unMes, unDia, unaHora, unMinuto, unSegundo);
	}

	public void setSystemId(Integer systemId) {
		this.systemId = systemId;
	}

	public Integer getSystemId() {
		return this.systemId;
	}

	//Esto hay que tocarlo... aca esta dando la diferencia numérica entre los meses
	public Integer getMesesComoAdministrador() {
		return (new GregorianCalendar()).get(Calendar.MONTH) - this.fechaAlta.get(Calendar.MONTH);
	}
}
