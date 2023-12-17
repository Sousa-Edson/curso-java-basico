package _07Enumeradores;

public class ExemploUsoEnum {
    public static void main(String[] args) {
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setNumero(123);
        notaFiscal.setStatus(StatusNotaFiscal.AGUARDANDO_APROVACAO);

        notaFiscal.imprimirStatus();  // Saída: Status da Nota Fiscal #123: Aguardando Aprovação
    }
}
