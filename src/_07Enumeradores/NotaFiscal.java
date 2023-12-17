package _07Enumeradores;

public class NotaFiscal {
    private int numero;
    private StatusNotaFiscal status;

    // Construtor, métodos getters e setters

    public void imprimirStatus() {
        System.out.println("Status da Nota Fiscal #" + numero + ": " + status.getDescricao());
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public StatusNotaFiscal getStatus() {
		return status;
	}

	public void setStatus(StatusNotaFiscal status) {
		this.status = status;
	}
}
