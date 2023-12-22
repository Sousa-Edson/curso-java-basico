package _11ClassesUtilitarias.LocalDate;

import java.time.LocalDate;

public class ExemploLocalDate {
	public static void main(String[] args) {
		// Obtendo a data atual
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual: " + dataAtual);

		// Criando uma data específica
		LocalDate outraData = LocalDate.of(2023, 12, 25);
		System.out.println("Outra Data: " + outraData);
	}
}
