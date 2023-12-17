package _07Enumeradores;

public class ExemploEnum { 
	    public static void main(String[] args) {
	        DiaSemana2[] dias = DiaSemana2.values();

	        for (DiaSemana2 dia : dias) {
	            System.out.println(dia);
	        }
	    }
	}