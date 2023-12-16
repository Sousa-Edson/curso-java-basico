package _04ForEach;

import java.util.ArrayList;
import java.util.List;

public class ExemploForEachLista {
	public static void main(String[] args) {
		// Criando uma lista de strings
		List<String> frutas = new ArrayList<>();
		frutas.add("Maçã");
		frutas.add("Banana");
		frutas.add("Morango");

		// Usando for-each para iterar sobre os elementos da lista
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
	}
}
