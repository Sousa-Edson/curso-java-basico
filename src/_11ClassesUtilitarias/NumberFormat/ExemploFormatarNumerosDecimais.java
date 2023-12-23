package _11ClassesUtilitarias.NumberFormat;

import java.text.NumberFormat;
import java.util.Locale;

public class ExemploFormatarNumerosDecimais {
	public static void main(String[] args) {
		// Obtendo o formato para o locale padrão
		NumberFormat formatoPadrao = NumberFormat.getInstance();

		// Formatando um número decimal
		double numeroDecimal = 12345.6789;
		String numeroFormatado = formatoPadrao.format(numeroDecimal);
		System.out.println("Número Decimal Formatado: " + numeroFormatado);

		// Obtendo o formato para o alemão
		NumberFormat formatoAlemao = NumberFormat.getInstance(Locale.GERMANY);

		// Formatando o mesmo número para o alemão
		String numeroFormatadoAlemao = formatoAlemao.format(numeroDecimal);
		System.out.println("Número Decimal Formatado (Alemão): " + numeroFormatadoAlemao);
	}
}
