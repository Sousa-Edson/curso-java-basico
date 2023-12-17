package _05OrientacaoObjetosJava.herancaProtected.pacote2;

import _05OrientacaoObjetosJava.herancaProtected.pacote1.Animal;

public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String tipo, String raca) {
        this.tipo = tipo;  // Membro 'tipo' é acessível devido ao modificador 'protected'
        this.raca = raca;
    }

    public void latir() {
        fazerBarulho();  // Método 'fazerBarulho' é acessível devido ao modificador 'protected'
        System.out.println("Latindo!");
    }
}	