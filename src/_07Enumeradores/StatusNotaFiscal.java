package _07Enumeradores;

public enum StatusNotaFiscal {
    EM_DIGITACAO("Em Digitação"),
    AGUARDANDO_APROVACAO("Aguardando Aprovação"),
    APROVADA("Aprovada"),
    REJEITADA("Rejeitada"),
    EMITIDA("Emitida"),
    CANCELADA("Cancelada");

    private final String descricao;

    StatusNotaFiscal(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
