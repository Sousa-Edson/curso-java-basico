package _06Exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploFinallyArquivo {

	public static void main(String[] args) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			// Tente abrir e ler o arquivo
			fileReader = new FileReader("exemplo.txt");
			bufferedReader = new BufferedReader(fileReader);

			String linha;
			while ((linha = bufferedReader.readLine()) != null) {
				System.out.println(linha);
			}

		} catch (IOException e) {
			System.err.println("Ocorreu uma exceção de leitura: " + e.getMessage());

		} finally {
			// Este bloco será sempre executado, mesmo que ocorra uma exceção
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				System.err.println("Ocorreu uma exceção ao fechar o arquivo: " + e.getMessage());
			}
		}
	}
}
