package atividades13;

import java.util.Scanner;

public class Atividade08_2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Quanto você ganha no mês?");
	double salario= scanner.nextDouble();
	System.out.println("Digite quantas horas você trabalha no mês: ");
	double horasMes= scanner.nextDouble();
	
	double horaValor= salario/horasMes;
	
	System.out.println("O valor de sua hora é: "+horaValor);
	scanner.close();
}
}
