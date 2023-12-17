package _05OrientacaoObjetosJava.herancaSuperConstrutor;

class Cachorro extends Animal {
	String raca;

	Cachorro(String tipo, String raca) {
		super(tipo); // Chamada ao construtor da superclasse
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "Cachorro [raca=" + raca + ", tipo=" + tipo + "]";
	}

	 
	
}