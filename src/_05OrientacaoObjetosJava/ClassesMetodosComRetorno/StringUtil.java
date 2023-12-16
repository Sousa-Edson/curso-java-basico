package _05OrientacaoObjetosJava.ClassesMetodosComRetorno;

public class StringUtil {
    // Método para concatenar duas strings
    public String concatenar(String str1, String str2) {
        return str1 + str2;
    }

    // Método para inverter uma string
    public String inverter(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        // Criando objeto da classe StringUtil
        StringUtil util = new StringUtil();

        // Chamando métodos e exibindo resultados
        String resultadoConcatenacao = util.concatenar("Olá, ", "Mundo!");
        String resultadoInversao = util.inverter("Java");

        System.out.println("Resultado da Concatenação: " + resultadoConcatenacao);
        System.out.println("Resultado da Inversão: " + resultadoInversao);
    }
}
