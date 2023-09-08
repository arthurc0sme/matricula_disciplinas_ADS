package trabalhoGrauA;

//Classe semestre com todas as 8 disciplinas, mesmo que o 6 semestre tenha apenas 3 disciplinas, deixamos as disciplinas restantes vazias, o programa principal não irá lê-las.
public class Semestre {
	private String disciplina1;
	private String disciplina2;
	private String disciplina3;
	private String disciplina4;
	private String disciplina5;
	private String disciplina6;
	private String disciplina7;
	private String disciplina8;

	public String getDisciplina1() {
		return disciplina1;
	}

	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}

	public String getDisciplina2() {
		return disciplina2;
	}

	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}

	public String getDisciplina3() {
		return disciplina3;
	}

	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}

	public String getDisciplina4() {
		return disciplina4;
	}

	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}

	public String getDisciplina5() {
		return disciplina5;
	}

	public void setDisciplina5(String disciplina5) {
		this.disciplina5 = disciplina5;
	}

	public String getDisciplina6() {
		return disciplina6;
	}

	public void setDisciplina6(String disciplina6) {
		this.disciplina6 = disciplina6;
	}

	public String getDisciplina7() {
		return disciplina7;
	}

	public void setDisciplina7(String disciplina7) {
		this.disciplina7 = disciplina7;
	}

	public String getDisciplina8() {
		return disciplina8;
	}

	public void setDisciplina8(String disciplina8) {
		this.disciplina8 = disciplina8;
	}

	public String relatorio() {
		return "\n Disciplinas: " + "\n " + disciplina1 + "\n " + disciplina2 + "\n " + disciplina3 + "\n "
				+ disciplina4 + "\n " + disciplina5 + "\n " + disciplina6 + "\n " + disciplina7 + "\n " + disciplina8;
	}

	public Semestre(String disciplina1, String disciplina2, String disciplina3, String disciplina4, String disciplina5,
			String disciplina6, String disciplina7, String disciplina8) {
		super();
		this.disciplina1 = disciplina1;
		this.disciplina2 = disciplina2;
		this.disciplina3 = disciplina3;
		this.disciplina4 = disciplina4;
		this.disciplina5 = disciplina5;
		this.disciplina6 = disciplina6;
		this.disciplina7 = disciplina7;
		this.disciplina8 = disciplina8;
	}

}
