package _06Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExemploThrows {

	public static void main(String[] args) {
		try {
			lerArquivo();
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado: " + e.getMessage());
		}
	}

	static void lerArquivo() throws FileNotFoundException {
		FileReader fileReader = new FileReader("arquivo.txt");
		// Lógica para ler o arquivo...
	}
}
