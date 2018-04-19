package sge;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Administrador extends Usuario {

	//Esto hay que tocarlo... aca esta dando la diferencia numérica entre los meses
	public Integer getMesesComoAdministrador() {
		return (new GregorianCalendar()).get(Calendar.MONTH) - this.fechaAlta.get(Calendar.MONTH);
	}
}
