package _11ClassesUtilitarias.LocalDate;

import java.time.LocalDateTime;

public class ExemploLocalDateTime {
	public static void main(String[] args) {
		// Obtendo a data e hora atual
		LocalDateTime dataHoraAtual = LocalDateTime.now();
		System.out.println("Data e Hora Atuais: " + dataHoraAtual);

		// Criando uma data e hora específicas
		LocalDateTime outraDataHora = LocalDateTime.of(2023, 12, 25, 15, 30, 0);
		System.out.println("Outra Data e Hora: " + outraDataHora);
	}
}