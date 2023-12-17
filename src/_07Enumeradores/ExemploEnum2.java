package _07Enumeradores;

public class ExemploEnum2 {
    public static void main(String[] args) {
        String nomeDia = "QUARTA";
        DiaSemana2 dia = DiaSemana2.valueOf(nomeDia);

        System.out.println("Dia da semana: " + dia);
    }
}