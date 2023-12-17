package _07Enumeradores;

public enum Status {
	PENDENTE("Aguardando Processamento"), PROCESSADO("Concluído com Sucesso"), ERRO("Erro durante o Processamento");

	private final String descricao;

	Status(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
