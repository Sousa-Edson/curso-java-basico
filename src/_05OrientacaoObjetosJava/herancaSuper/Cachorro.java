package _05OrientacaoObjetosJava.herancaSuper;

class Cachorro extends Animal {
    @Override
    void fazerBarulho() {
        super.fazerBarulho();  // Chamada ao método da superclasse
        System.out.println("Latido!");
    }
}