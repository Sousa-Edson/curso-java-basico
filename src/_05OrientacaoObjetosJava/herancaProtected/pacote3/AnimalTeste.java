package _05OrientacaoObjetosJava.herancaProtected.pacote3;

import _05OrientacaoObjetosJava.herancaProtected.pacote2.Cachorro;

public class AnimalTeste {
    public static void main(String[] args) {
        // Criando uma instância de Cachorro
        Cachorro meuCachorro = new Cachorro("Mamífero", "Labrador");

        // Acessando membros herdados da classe Animal (pacote1) através da classe Cachorro (pacote2)
//        System.out.println("Tipo do animal: " + meuCachorro.tipo);
//        meuCachorro.fazerBarulho();
        meuCachorro.latir();
    }
}