package tad.alunos;

public class AlunoImplements implements AlunoInterface {

	@Override
	public Aluno save(String nome, String semestre) {
		return new Aluno(nome, semestre);
	}

}
