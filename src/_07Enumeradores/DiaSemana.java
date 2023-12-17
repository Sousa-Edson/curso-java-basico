package _07Enumeradores;

public class DiaSemana {

    public enum EnumDia {
        DOMINGO("Domingo"),
        SEGUNDA("Segunda-feira"),
        TERCA("Terça-feira"),
        QUARTA("Quarta-feira"),
        QUINTA("Quinta-feira"),
        SEXTA("Sexta-feira"),
        SABADO("Sábado");

        private final String nome;

        EnumDia(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public String saudacao() {
            return "Bom dia, hoje é " + nome;
        }
    }

    public static void main(String[] args) {
        // Exemplo de uso do enumerador como classe
        EnumDia hoje = EnumDia.DOMINGO;

        // Obtendo o nome do dia
        System.out.println("Hoje é " + hoje.getNome());

        // Obtendo uma saudação baseada no dia
        System.out.println(hoje.saudacao());
    }
}
