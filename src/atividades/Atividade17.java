package atividades;

import java.util.Scanner;

/*Faça um Programa para uma loja de tintas. O programa deverá pedir o
tamanho em metros quadrados da área a ser pintada. Considere que a
cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a
tinta é vendida em latas de 18 litros, que custam R$ 80,00 ou em
galões de 3,6 litros, que custam R$ 25,00.
o Informe ao usuário as quantidades de tinta a serem compradas
e os respectivos preços em 3 situações:
o comprar apenas latas de 18 litros;
o comprar apenas galões de 3,6 litros;
o misturar latas e galões, de forma que o preço seja o
menor. Acrescente 10% de folga e sempre arredonde os
valores para cima, isto é, considere latas cheias.*/
public class Atividade17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Informe o tamanho da área a ser pintada em metros quadrados: ");
		double areaASerPintada = scanner.nextDouble();

		double litrosNecessarios = areaASerPintada / 6.0;

		litrosNecessarios *= 1.1;

		int latas18L = (int) Math.ceil(litrosNecessarios / 18.0);

		double precoLatas18L = latas18L * 80.0;

		int galoes3_6L = (int) Math.ceil(litrosNecessarios / 3.6);

		double precoGaloes3_6L = galoes3_6L * 25.0;

		int latasParaMistura = (int) Math.floor(litrosNecessarios / 18.0);
		int galoesParaMistura = (int) Math.ceil((litrosNecessarios % 18.0) / 3.6);

		double precoMistura = (latasParaMistura * 80.0) + (galoesParaMistura * 25.0);

		System.out.println("\nQuantidade de tinta necessária: " + litrosNecessarios + " litros");
		System.out.println("Opção 1 - Comprar apenas latas de 18 litros:");
		System.out.println("   Quantidade de latas: " + latas18L);
		System.out.println("   Preço total: R$ " + precoLatas18L);

		System.out.println("\nOpção 2 - Comprar apenas galões de 3,6 litros:");
		System.out.println("   Quantidade de galões: " + galoes3_6L);
		System.out.println("   Preço total: R$ " + precoGaloes3_6L);

		System.out.println("\nOpção 3 - Misturar latas e galões para o menor preço:");
		System.out.println("   Quantidade de latas: " + latasParaMistura);
		System.out.println("   Quantidade de galões: " + galoesParaMistura);
		System.out.println("   Preço total: R$ " + precoMistura);
	}
}
