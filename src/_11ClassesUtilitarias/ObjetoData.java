package _11ClassesUtilitarias;

import java.util.Date;

public class ObjetoData {
	public static void main(String[] args) {

		Date dataAtual = new Date();
		System.out.println("Data atual: " + dataAtual);

		long timestamp = System.currentTimeMillis();
		Date dataTimestamp = new Date(timestamp);
		System.out.println("Data a partir de um timestamp: " + dataTimestamp);

		Date dataAtual2 = new Date();
		long umDiaEmMilissegundos = 24 * 60 * 60 * 1000; // 1 dia em milissegundos
		Date dataAmanha = new Date(dataAtual2.getTime() + umDiaEmMilissegundos);
		System.out.println("Data amanhã: " + dataAmanha);

		Date data1 = new Date();
		Date data2 = new Date(data1.getTime() + umDiaEmMilissegundos);
		if (data1.before(data2)) {
			System.out.println("data1 é anterior a data2.");
		} else if (data1.after(data2)) {
			System.out.println("data1 é posterior a data2.");
		} else {
			System.out.println("data1 é igual a data2.");
		}

	}
}
