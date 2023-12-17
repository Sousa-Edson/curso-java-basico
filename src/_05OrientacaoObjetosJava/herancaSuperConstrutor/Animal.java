package _05OrientacaoObjetosJava.herancaSuperConstrutor;

class Animal {
	String tipo;

	Animal(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Animal [tipo=" + tipo + "]";
	}

}