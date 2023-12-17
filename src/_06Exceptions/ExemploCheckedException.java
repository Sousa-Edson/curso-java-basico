package _06Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploCheckedException {
    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (IOException e) {
            System.err.println("Erro de leitura: " + e.getMessage());
        }
    }

    static void lerArquivo() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
        String linha = reader.readLine();
        System.out.println("Conteúdo do arquivo: " + linha);
        reader.close();
    }
}
