package _05OrientacaoObjetosJava.relacionamentoTemMuitos;

public class Main {
	public static void main(String[] args) {
		Turma turma = new Turma("Sala 12");

		Aluno aluno = new Aluno();
		aluno.setMatricula(1);
		aluno.setNome("David Gabriel");
		turma.adicionarAluno(aluno);

		Aluno aluno2 = new Aluno();
		aluno2.setMatricula(2);
		aluno2.setNome("Ian Miguel");
		turma.adicionarAluno(aluno2);

		Aluno aluno3 = new Aluno();
		aluno3.setMatricula(3);
		aluno3.setNome("Leonardo Antonio");
		turma.adicionarAluno(aluno3);
		
		System.out.println(turma);
	}
}
