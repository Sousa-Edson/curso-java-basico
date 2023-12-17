package _06Exceptions;

public class ExemploExcecaoPersonalizada {
	public static void main(String[] args) {

		try {
			MinhaExcecao.validarIdade(10);
		} catch (MinhaExcecao e) {
			// TODO Auto-generated catch block
			e.printStackTrace();;
		}

	}

}
