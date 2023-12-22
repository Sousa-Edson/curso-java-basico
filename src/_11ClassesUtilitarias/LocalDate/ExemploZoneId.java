package _11ClassesUtilitarias.LocalDate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExemploZoneId {
	public static void main(String[] args) {
		// Obtendo o fuso horário padrão do sistema
		ZoneId fusoPadrao = ZoneId.systemDefault();
		System.out.println("Fuso Horário Padrão: " + fusoPadrao);

		// Obtendo a data e hora em um fuso horário específico
		ZoneId fusoNY = ZoneId.of("America/New_York");
		ZonedDateTime dataHoraNY = ZonedDateTime.now(fusoNY);
		System.out.println("Data e Hora em Nova Iorque: " + dataHoraNY);
	}
}
