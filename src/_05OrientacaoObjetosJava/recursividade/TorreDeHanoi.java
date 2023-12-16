package _05OrientacaoObjetosJava.recursividade;

public class TorreDeHanoi {

    // Função recursiva para resolver o problema da Torre de Hanoi
    static void torreDeHanoi(int discos, char origem, char destino, char auxiliar) {
        if (discos == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
        } else {
            torreDeHanoi(discos - 1, origem, auxiliar, destino);
            System.out.println("Mover disco " + discos + " de " + origem + " para " + destino);
            torreDeHanoi(discos - 1, auxiliar, destino, origem);
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int discos = 3;
        torreDeHanoi(discos, 'A', 'C', 'B');
    }
}
