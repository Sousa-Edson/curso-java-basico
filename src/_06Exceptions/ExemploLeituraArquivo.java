package _06Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraArquivo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			// Solicita ao usuário que insira o caminho do arquivo
			System.out.print("Digite o caminho do arquivo: ");
			String caminhoArquivo = scanner.nextLine();

			// Tenta ler o conteúdo do arquivo
			lerArquivo(caminhoArquivo);
		} catch (FileNotFoundException e) {
			// Captura e trata a exceção se o arquivo não for encontrado
			System.err.println("Arquivo não encontrado: " + e.getMessage());
		} finally {
			// Fecha o scanner no bloco finally
			scanner.close();
		}
	}

	private static void lerArquivo(String caminho) throws FileNotFoundException {
		File arquivo = new File(caminho);
		Scanner leitor = new Scanner(arquivo);

		// Lê e imprime cada linha do arquivo
		while (leitor.hasNextLine()) {
			String linha = leitor.nextLine();
			System.out.println(linha);
		}

		// Fecha o leitor
		leitor.close();
	}
}
