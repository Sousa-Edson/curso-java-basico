package _11ClassesUtilitarias.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploFormatarNumeros {
	public static void main(String[] args) {
		// Obtendo o formato padrão para o locale padrão
		NumberFormat formatoPadrao = NumberFormat.getInstance();

		// Formatando um número inteiro
		int numero = 1234567;
		String numeroFormatado = formatoPadrao.format(numero);
		System.out.println("Número Formatado: " + numeroFormatado);

		// Obtendo o formato para o francês
		NumberFormat formatoFrances = NumberFormat.getInstance(Locale.FRENCH);

		// Formatando o mesmo número para o francês
		String numeroFormatadoFrances = formatoFrances.format(numero);
		System.out.println("Número Formatado (Francês): " + numeroFormatadoFrances);

		// Obtendo o formato para o CHINESE
		NumberFormat formatoChinese = NumberFormat.getInstance(Locale.CHINESE);

		// Formatando o mesmo número para o CHINESE
		String numeroFormatadoChinese = formatoChinese.format(numero);
		System.out.println("Número Formatado (Chinese): " + numeroFormatadoChinese);

		
		Locale localePortuguesBrasil = new Locale("pt", "BR");
		// Obtendo o formato para o Brazil
		NumberFormat formatoBrazil = NumberFormat.getInstance(localePortuguesBrasil);

		// Formatando o mesmo número para o Brazil
		String numeroFormatadoBrazil = formatoBrazil.format(numero);
		System.out.println("Número Formatado (Brasil): " + numeroFormatadoBrazil);

	}
}
