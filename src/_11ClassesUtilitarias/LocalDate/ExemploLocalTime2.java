package _11ClassesUtilitarias.LocalDate;

import java.time.LocalTime;

public class ExemploLocalTime2 {
    public static void main(String[] args) {
        // Obtendo o horário atual
        LocalTime horarioAtual = LocalTime.now();
        System.out.println("Horário Atual: " + horarioAtual);

        // Criando um horário específico
        LocalTime outroHorario = LocalTime.of(15, 30, 0);
        System.out.println("Outro Horário: " + outroHorario);
    }
}