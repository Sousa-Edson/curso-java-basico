package _11ClassesUtilitarias;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExemploFormatarData {
    public static void main(String[] args) {
        // Criando um objeto Date representando a data e hora atual
        Date dataAtual = new Date();

        // Criando um objeto SimpleDateFormat com um padrão de formatação
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Formatando a data atual como uma string
        String dataFormatada = formato.format(dataAtual);

        // Exibindo a data formatada
        System.out.println("Data formatada: " + dataFormatada);
    }
}
