package _11ClassesUtilitarias.LocalDate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExemploZonedDateTime {
	public static void main(String[] args) {
		// Obtendo a data e hora atual em um fuso horário específico
		ZonedDateTime dataHoraAtualNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("Data e Hora Atuais em Nova Iorque: " + dataHoraAtualNY);

		// Criando uma data e hora específicas em um fuso horário específico
		ZonedDateTime outraDataHoraNY = ZonedDateTime.of(2023, 12, 25, 15, 30, 0, 0, ZoneId.of("America/New_York"));
		System.out.println("Outra Data e Hora em Nova Iorque: " + outraDataHoraNY);
	}
}