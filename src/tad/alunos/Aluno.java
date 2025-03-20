package tad.alunos;

public class Aluno {
	
	private String nome;
	private String semestre;
	
	public Aluno(String nome, String semestre) {
		super();
		this.nome = nome;
		this.semestre = semestre;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

}
