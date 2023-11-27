package atividades;

import java.util.Scanner;

/*Faça um programa que peça o tamanho de um arquivo para download
(em MB) e a velocidade de um link de Internet (em Mbps), calcule e
informe o tempo aproximado de download do arquivo usando este link
(em minutos).*/
public class Atividade18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicitar o tamanho do arquivo em MB
		System.out.print("Informe o tamanho do arquivo para download (em MB): ");
		double tamanhoArquivoMB = scanner.nextDouble();

		// Solicitar a velocidade do link de Internet em Mbps
		System.out.print("Informe a velocidade do link de Internet (em Mbps): ");
		double velocidadeInternetMbps = scanner.nextDouble();

		// Calcular o tempo aproximado de download em minutos
		double tempoDownloadMinutos = (tamanhoArquivoMB / (velocidadeInternetMbps / 8)) / 60;

		// Exibir o resultado
		System.out.println("\nTempo aproximado de download: " + tempoDownloadMinutos + " minutos");
	}
}
