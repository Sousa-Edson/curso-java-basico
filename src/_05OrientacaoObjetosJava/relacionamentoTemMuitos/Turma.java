package _05OrientacaoObjetosJava.relacionamentoTemMuitos;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	private String nomeTurma;
	private List<Aluno> alunos; // Relacionamento "tem muitos" com a classe Aluno

	public Turma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
		this.alunos = new ArrayList<>();
	}

	public void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public String getNomeTurma() {
		return nomeTurma;
	}

	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Turma [nomeTurma=" + nomeTurma + ", alunos=" + alunos + "]";
	}

}