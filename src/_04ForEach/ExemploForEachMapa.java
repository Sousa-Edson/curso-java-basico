package _04ForEach;

import java.util.HashMap;
import java.util.Map;

public class ExemploForEachMapa {
	public static void main(String[] args) {
		// Criando um mapa (Map) de strings para inteiros
		Map<String, Integer> notas = new HashMap<>();
		notas.put("Alice", 85);
		notas.put("Bob", 92);
		notas.put("Charlie", 78);

		// Usando for-each para iterar sobre as entradas do mapa
		for (Map.Entry<String, Integer> entrada : notas.entrySet()) {
			System.out.println(entrada.getKey() + ": " + entrada.getValue());
		}
	}
}
