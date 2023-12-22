package _11ClassesUtilitarias.TimeZone;

import java.util.TimeZone;

public class ExemploTodosFusosHorarios {
    public static void main(String[] args) {
        // Obtendo todos os IDs de fusos horários suportados
        String[] todosIDs = TimeZone.getAvailableIDs();

        // Exibindo alguns IDs como exemplo
        int quantidadeExemplos = 5;
        for (int i = 0; i < quantidadeExemplos; i++) {
            System.out.println("Exemplo de ID: " + todosIDs[i]);
        }
    }
}