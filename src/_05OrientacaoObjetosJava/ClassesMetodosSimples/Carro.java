package _05OrientacaoObjetosJava.ClassesMetodosSimples;

public class Carro {
    // Atributos
    String marca;
    String modelo;
    int ano;

    // Método para exibir informações
    void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Corolla";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.marca = "Honda";
        carro2.modelo = "Civic";
        carro2.ano = 2021;

        // Chamando método para exibir informações
        System.out.println("Carro 1:");
        carro1.exibirInfo();

        System.out.println("\nCarro 2:");
        carro2.exibirInfo();
    }
}
