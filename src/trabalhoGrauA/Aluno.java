package trabalhoGrauA;

//Classe aluno, com as variáveis nomealuno, matriculaaluno, disciplina, numdisciplinas e seu numsemestre
public class Aluno {
	private String alunoNome;
	private int matriculaAluno;
	private int numDisciplinas;
	private int numSemestre;

	public String getAlunoNome() {
		return alunoNome;
	}

	public void setAlunoNome(String alunoNome) {
		this.alunoNome = alunoNome;
	}

	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public int getNumDisciplinas() {
		return numDisciplinas;
	}

	public void setNumDisciplinas(int numDisciplinas) {
		this.numDisciplinas = numDisciplinas;
	}

	public int getNumSemestre() {
		return numSemestre;
	}

	public void setNumSemestre(int numSemestre) {
		this.numSemestre = numSemestre;
	}

	public Aluno(String alunoNome, int matriculaAluno, int numDisciplinas, int numSemestre) {
		this.alunoNome = alunoNome;
		this.matriculaAluno = matriculaAluno;
		this.numDisciplinas = numDisciplinas;
		this.numSemestre = numSemestre;
	}

	@Override
	public String toString() {
		return "Aluno: " + this.alunoNome + ", Numero de Matricula: " + this.matriculaAluno
				+ ", número de disciplinas cursadas : " + this.numDisciplinas + ", em qual semestre está : "
				+ this.numSemestre;
	}
}
