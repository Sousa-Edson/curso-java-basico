package _11ClassesUtilitarias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {
	public static void main(String[] args) {
		// Obter uma instância de Calendar
		Calendar calendar = new GregorianCalendar();

		// Obter informações de data
		int ano = calendar.get(Calendar.YEAR);
		int mes = calendar.get(Calendar.MONTH) + 1; // Janeiro é representado por 0
		int dia = calendar.get(Calendar.DAY_OF_MONTH);

		// Obter informações de hora
		int hora = calendar.get(Calendar.HOUR_OF_DAY);
		int minuto = calendar.get(Calendar.MINUTE);
		int segundo = calendar.get(Calendar.SECOND);

		System.out.println("Data atual: " + dia + "/" + mes + "/" + ano);
		System.out.println("Hora atual: " + hora + ":" + minuto + ":" + segundo);
	}
}
