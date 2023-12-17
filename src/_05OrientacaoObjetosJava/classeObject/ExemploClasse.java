package _05OrientacaoObjetosJava.classeObject;

import java.util.Objects;

public class ExemploClasse {

    private int numero;

    // Construtor
    public ExemploClasse(int numero) {
        this.numero = numero;
    }

    // Método equals sobrescrito
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExemploClasse outraClasse = (ExemploClasse) obj;
        return numero == outraClasse.numero;
    }

    // Método hashCode sobrescrito
    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "ExemploClasse{" +
               "numero=" + numero +
               '}';
    }

    public static void main(String[] args) {
        // Criando instâncias da classe
        ExemploClasse obj1 = new ExemploClasse(42);
        ExemploClasse obj2 = new ExemploClasse(42);

        // Usando o método equals
        System.out.println("obj1 é igual a obj2? " + obj1.equals(obj2));

        // Usando o método hashCode
        System.out.println("Hash code de obj1: " + obj1.hashCode());

        // Usando o método toString
        System.out.println("Representação de string de obj1: " + obj1);
    }
}
