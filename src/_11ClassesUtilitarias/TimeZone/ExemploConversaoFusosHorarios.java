package _11ClassesUtilitarias.TimeZone;

import java.util.Date;
import java.util.TimeZone;

public class ExemploConversaoFusosHorarios {
	public static void main(String[] args) {
		// Criando um objeto Date representando a data e hora atual
		Date dataAtual = new Date();

		// Obtendo o fuso horário para Nova Iorque (Eastern Time)
		TimeZone fusoNY = TimeZone.getTimeZone("America/New_York");

		// Convertendo a data atual para o fuso horário de Nova Iorque
		long novaData = dataAtual.getTime() + fusoNY.getRawOffset();
		Date dataEmNY = new Date(novaData);

		// Exibindo a data convertida
		System.out.println("Data Atual: " + dataAtual);
		System.out.println("Data em Nova Iorque: " + dataEmNY);
	}
}