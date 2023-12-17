package _05OrientacaoObjetosJava.classeObject;

import java.util.Objects;

public class MinhaClasse {
	private int valor;

	// Construtor, getters, setters, etc.

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		MinhaClasse outraClasse = (MinhaClasse) obj;
		return valor == outraClasse.valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(valor);
	}

	@Override
	public String toString() {
		return "MinhaClasse{" + "valor=" + valor + '}';
	}

}
