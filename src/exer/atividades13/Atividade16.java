package exer.atividades13;

import java.util.Scanner;

/*Faça um programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao
usuário a quantidades de latas de tinta a serem compradas e o preço
total.
*/
public class Atividade16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o tamanho em metros quadrados da área a ser pintada: ");
		double areaParaPintar = scanner.nextDouble();
 
		double litrosNecessarios = areaParaPintar / 3;
 
		int latasNecessarias = (int) Math.ceil(litrosNecessarios / 18); //Math.ceil -> arredonta o inteiro pra cima
 
		double precoPorLata = 80.00;
 
		double precoTotal = latasNecessarias * precoPorLata;

		System.out.println("Quantidade de latas de tinta necessárias: " + latasNecessarias);
		System.out.println("Preço total: R$ " + precoTotal);

		scanner.close();
	}
}
