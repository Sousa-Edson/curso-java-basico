package _11ClassesUtilitarias.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ExemploResourceBundle {
	public static void main(String[] args) {
		// Obtendo o ResourceBundle padrão para o local padrão (ingles)
		ResourceBundle bundlePadrao = ResourceBundle.getBundle("messages");

		// Obtendo o ResourceBundle para o francês (se disponível)
		Locale localeFrances = new Locale("fr", "FR");
		ResourceBundle bundleFrances = ResourceBundle.getBundle("messages", localeFrances);

		// Exibindo mensagens
		System.out.println("Padrão: " + bundlePadrao.getString("greeting") + ", " + bundlePadrao.getString("farewell"));
		System.out.println(
				"Francês: " + bundleFrances.getString("greeting") + ", " + bundleFrances.getString("farewell"));
	}
}
