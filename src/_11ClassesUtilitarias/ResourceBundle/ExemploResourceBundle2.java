package _11ClassesUtilitarias.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ExemploResourceBundle2 {
	public static void main(String[] args) {
		// Obtendo o ResourceBundle para o português do Brasil (pt_BR)
		Locale localePortuguesBrasil = new Locale("pt", "BR");
		ResourceBundle bundlePortuguesBrasil = ResourceBundle.getBundle("messages", localePortuguesBrasil);

		// Exibindo mensagens para o português do Brasil
		System.out.println("Português do Brasil: " + bundlePortuguesBrasil.getString("greeting") + ", "
				+ bundlePortuguesBrasil.getString("farewell"));
	}
}
