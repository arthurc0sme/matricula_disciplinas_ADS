package trabalhoGrauA;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) throws InterruptedException {

		// Aqui é a criação dos 6 semestres do curso de Análise e Desenvolvimento de
		// Sistemas, com suas respectivas disciplinas, separadas por semestre.
		Semestre semestre1 = new Semestre("Processo de Software", "Introdução à Informática","Fundamentos de Programação", "Lógica Matemática", "TI TEC Experience 1", "Planejamento de Carreira","LAB Tools 1", "LAB Tools 2");
		Semestre semestre2 = new Semestre("Programação Orientada a Objetos","Modelos de Melhoria do Processo de Software", "Fundamentos de Banco de Dados","Engenharia de Software: Requisitos e Análise","TI TEC Experience 2","Técnicas Comunicacionais","LAB Tools 3","LAB Tools 4");
		Semestre semestre3 = new Semestre("Estruturas de Dados Lineares","Engenharia de Software: Projeto e Desenvolvimento", "Implementação de Software", "Design de Interação","TI TEC Experience 3", "Responsabilidade Social ", "LAB Tools 5", "LAB Tools 6");
		Semestre semestre4 = new Semestre("Gestão de Projetos de Software", "Processos de Teste de Software ","Estruturas de Dados Avançadas", "Desenvolvimento Web e Aplicativos", "TI TEC Experience 4","Ética e Filosofia", "LAB Tools 7", "LAB Tools 8");
		Semestre semestre5 = new Semestre("Arquitetura de Software ", "Probabilidade e Estatística","Fundamentos de Segurança Cibernética", "Projeto Final I", "TI TEC Experience 5", "Análise de Dados","LAB Tools 9", "LAB Tools 10");
		Semestre semestre6 = new Semestre("Projeto Final II","Avaliação e Seleção de Soluções Técnicas e ROI",
		"Métricas e Gerenciamento quantitativo de Projetos", "---", "---", "---", "---", "---");

		// Aqui é a criação das Strings que irão possui o nome das disciplinas que o
		// Aluno já fez.
		String nomedisciplina1 = null;
		String nomedisciplina2 = null;
		String nomedisciplina3 = null;
		String nomedisciplina4 = null;
		String nomedisciplina5 = null;
		String nomedisciplina6 = null;
		String nomedisciplina7 = null;
		String nomedisciplina8 = null;
		String nomedisciplina9 = null;
		String nomedisciplina10 = null;
		String nomedisciplina11 = null;
		String nomedisciplina12 = null;
		String nomedisciplina13 = null;
		String nomedisciplina14 = null;
		String nomedisciplina15 = null;
		String nomedisciplina16 = null;
		String nomedisciplina17 = null;
		String nomedisciplina18 = null;
		String nomedisciplina19 = null;
		String nomedisciplina20 = null;
		String nomedisciplina21 = null;
		String nomedisciplina22 = null;
		String nomedisciplina23 = null;
		String nomedisciplina24 = null;
		String nomedisciplina25 = null;
		String nomedisciplina26 = null;
		String nomedisciplina27 = null;
		String nomedisciplina28 = null;
		String nomedisciplina29 = null;
		String nomedisciplina30 = null;
		String nomedisciplina31 = null;
		String nomedisciplina32 = null;
		String nomedisciplina33 = null;
		String nomedisciplina34 = null;
		String nomedisciplina35 = null;
		String nomedisciplina36 = null;
		String nomedisciplina37 = null;
		String nomedisciplina38 = null;
		String nomedisciplina39 = null;
		String nomedisciplina40 = null;
		String nomedisciplina41 = null;
		String nomedisciplina42 = null;
		String nomedisciplina43 = null;

		// Strings auxiliares, que recebem as disciplinas dos semestres, servirão para
		// mais na frente fazer a comparação com as disciplinas feitas pelo aluno.
		String faltadisciplina1 = semestre1.getDisciplina1();
		String faltadisciplina2 = semestre1.getDisciplina2();
		String faltadisciplina3 = semestre1.getDisciplina3();
		String faltadisciplina4 = semestre1.getDisciplina4();
		String faltadisciplina5 = semestre1.getDisciplina5();
		String faltadisciplina6 = semestre1.getDisciplina6();
		String faltadisciplina7 = semestre1.getDisciplina7();
		String faltadisciplina8 = semestre1.getDisciplina8();
		String faltadisciplina9 = semestre2.getDisciplina1();
		String faltadisciplina10 = semestre2.getDisciplina2();
		String faltadisciplina11 = semestre2.getDisciplina3();
		String faltadisciplina12 = semestre2.getDisciplina4();
		String faltadisciplina13 = semestre2.getDisciplina5();
		String faltadisciplina14 = semestre2.getDisciplina6();
		String faltadisciplina15 = semestre2.getDisciplina7();
		String faltadisciplina16 = semestre2.getDisciplina8();
		String faltadisciplina17 = semestre3.getDisciplina1();
		String faltadisciplina18 = semestre3.getDisciplina2();
		String faltadisciplina19 = semestre3.getDisciplina3();
		String faltadisciplina20 = semestre3.getDisciplina4();
		String faltadisciplina21 = semestre3.getDisciplina5();
		String faltadisciplina22 = semestre3.getDisciplina6();
		String faltadisciplina23 = semestre3.getDisciplina7();
		String faltadisciplina24 = semestre3.getDisciplina8();
		String faltadisciplina25 = semestre4.getDisciplina1();
		String faltadisciplina26 = semestre4.getDisciplina2();
		String faltadisciplina27 = semestre4.getDisciplina3();
		String faltadisciplina28 = semestre4.getDisciplina4();
		String faltadisciplina29 = semestre4.getDisciplina5();
		String faltadisciplina30 = semestre4.getDisciplina6();
		String faltadisciplina31 = semestre4.getDisciplina7();
		String faltadisciplina32 = semestre4.getDisciplina8();
		String faltadisciplina33 = semestre5.getDisciplina1();
		String faltadisciplina34 = semestre5.getDisciplina2();
		String faltadisciplina35 = semestre5.getDisciplina3();
		String faltadisciplina36 = semestre5.getDisciplina4();
		String faltadisciplina37 = semestre5.getDisciplina5();
		String faltadisciplina38 = semestre5.getDisciplina6();
		String faltadisciplina39 = semestre5.getDisciplina7();
		String faltadisciplina40 = semestre5.getDisciplina8();
		String faltadisciplina41 = semestre6.getDisciplina1();
		String faltadisciplina42 = semestre6.getDisciplina2();
		String faltadisciplina43 = semestre6.getDisciplina3();

		// Criação de um aluno vazio, para ser preenchido no primeiro menu do programa.
		String alunonome = null;
		int matriculaaluno = 0;
		int numdisciplinas = 0;
		int numsemestre = 0;

		// Criação do primeiro menu, antes do Aluno fazer seu cadastro com seus dados.
		boolean menu = true;
		boolean menu2 = false;
		boolean cadastro = false;
		Scanner scan = new Scanner(System.in);
		int opcao;

		while (menu) {
			System.out.println("\n============= CARREGANDO MENU DE CADASTRO =============");
			System.out.println("\nDigite 1 -  Realizar cadastro:");
			System.out.println("\nDigite 9 - Sair:");
			System.out.println("\n=======================================================");
			opcao = scan.nextInt();

			switch (opcao) {
				// Na opção 1, o aluno realiza o cadastro, informando seu nome, número de
				// matrícula e quantas disciplinas já fez.
				case 1:
					System.out.println("Nome do Aluno:");
					scan.nextLine();
					alunonome = scan.nextLine();
					System.out.println("Número da Matrícula: ");
					matriculaaluno = scan.nextInt();
					System.out.println("Digite a QUANTIDADE de Disciplinas realizadas[1-43]: ");
					numdisciplinas = scan.nextInt();
					// Caso o aluno tente inserir mais disciplinas do que o máximo que o curso
					// possui, o programa é encerrado.
					if (numdisciplinas > 43) {
						menu = false;
						System.out.println(
								"\n ERRO! Você não pode informar mais do que o máximo de disciplinas do curso! (43)");
						System.out.println("Programa encerrado!");
						break;
					}
					System.out.println("Digite o respectivo Semestre: ");
					numsemestre = scan.nextInt();
					scan.nextLine();
					Aluno Aluno = new Aluno(alunonome, matriculaaluno, numdisciplinas, numsemestre);
					// Laço for baseado no número de disciplinas informado pelo aluno, para garantir
					// a inserção do número exato de disciplinas.
					for (int i = 1; i <= numdisciplinas; i++) {

						System.out.println("Digite o nome da disciplina : ");
						String nome = scan.nextLine();

						if (i == 1) {
							nomedisciplina1 = nome;
							Disciplina disciplina1 = new Disciplina(nomedisciplina1);

						} else if (i == 2) {
							nomedisciplina2 = nome;
							Disciplina disciplina2 = new Disciplina(nomedisciplina2);

						} else if (i == 3) {
							nomedisciplina3 = nome;
							Disciplina disciplina3 = new Disciplina(nomedisciplina3);

						} else if (i == 4) {
							nomedisciplina4 = nome;
							Disciplina disciplina4 = new Disciplina(nomedisciplina4);

						} else if (i == 5) {
							nomedisciplina5 = nome;
							Disciplina disciplina5 = new Disciplina(nomedisciplina5);

						} else if (i == 6) {
							nomedisciplina6 = nome;
							Disciplina disciplina6 = new Disciplina(nomedisciplina6);

						} else if (i == 7) {
							nomedisciplina7 = nome;
							Disciplina disciplina7 = new Disciplina(nomedisciplina7);

						} else if (i == 8) {
							nomedisciplina8 = nome;
							Disciplina disciplina8 = new Disciplina(nomedisciplina8);

						} else if (i == 9) {
							nomedisciplina9 = nome;
							Disciplina disciplina9 = new Disciplina(nomedisciplina9);

						} else if (i == 10) {
							nomedisciplina10 = nome;
							Disciplina disciplina10 = new Disciplina(nomedisciplina10);

						} else if (i == 11) {
							nomedisciplina11 = nome;
							Disciplina disciplina11 = new Disciplina(nomedisciplina11);

						} else if (i == 12) {
							nomedisciplina12 = nome;
							Disciplina disciplina12 = new Disciplina(nomedisciplina12);

						} else if (i == 13) {
							;
							nomedisciplina13 = nome;
							Disciplina disciplina13 = new Disciplina(nomedisciplina13);

						} else if (i == 14) {
							nomedisciplina14 = nome;
							Disciplina disciplina14 = new Disciplina(nomedisciplina14);

						} else if (i == 15) {
							nomedisciplina15 = nome;
							Disciplina disciplina15 = new Disciplina(nomedisciplina15);

						} else if (i == 16) {
							nomedisciplina16 = nome;
							Disciplina disciplina16 = new Disciplina(nomedisciplina16);

						} else if (i == 17) {
							nomedisciplina17 = nome;
							Disciplina disciplina17 = new Disciplina(nomedisciplina17);

						} else if (i == 18) {
							nomedisciplina18 = nome;
							Disciplina disciplina18 = new Disciplina(nomedisciplina18);

						} else if (i == 19) {
							nomedisciplina19 = nome;
							Disciplina disciplina19 = new Disciplina(nomedisciplina19);

						} else if (i == 20) {
							nomedisciplina20 = nome;
							Disciplina disciplina20 = new Disciplina(nomedisciplina20);

						} else if (i == 21) {
							nomedisciplina21 = nome;
							Disciplina disciplina21 = new Disciplina(nomedisciplina21);

						} else if (i == 22) {
							nomedisciplina22 = nome;
							Disciplina disciplina22 = new Disciplina(nomedisciplina22);

						} else if (i == 23) {
							nomedisciplina23 = nome;
							Disciplina disciplina23 = new Disciplina(nomedisciplina23);

						} else if (i == 24) {
							nomedisciplina24 = nome;
							Disciplina disciplina24 = new Disciplina(nomedisciplina24);

						} else if (i == 25) {
							nomedisciplina25 = nome;
							Disciplina disciplina25 = new Disciplina(nomedisciplina25);

						} else if (i == 26) {
							nomedisciplina26 = nome;
							Disciplina disciplina26 = new Disciplina(nomedisciplina26);

						} else if (i == 27) {
							nomedisciplina27 = nome;
							Disciplina disciplina27 = new Disciplina(nomedisciplina27);

						} else if (i == 28) {
							nomedisciplina28 = nome;
							Disciplina disciplina28 = new Disciplina(nomedisciplina28);

						} else if (i == 29) {
							nomedisciplina29 = nome;
							Disciplina disciplina29 = new Disciplina(nomedisciplina29);

						} else if (i == 30) {
							nomedisciplina30 = nome;
							Disciplina disciplina30 = new Disciplina(nomedisciplina30);

						} else if (i == 31) {
							nomedisciplina31 = nome;
							Disciplina disciplina31 = new Disciplina(nomedisciplina31);

						} else if (i == 32) {
							nomedisciplina32 = nome;
							Disciplina disciplina32 = new Disciplina(nomedisciplina32);

						} else if (i == 33) {
							nomedisciplina33 = nome;
							Disciplina disciplina33 = new Disciplina(nomedisciplina33);

						} else if (i == 34) {
							nomedisciplina34 = nome;
							Disciplina disciplina34 = new Disciplina(nomedisciplina34);

						} else if (i == 35) {
							nomedisciplina35 = nome;
							Disciplina disciplina35 = new Disciplina(nomedisciplina35);

						} else if (i == 36) {
							nomedisciplina36 = nome;
							Disciplina disciplina36 = new Disciplina(nomedisciplina36);

						} else if (i == 37) {
							nomedisciplina37 = nome;
							Disciplina disciplina37 = new Disciplina(nomedisciplina37);

						} else if (i == 38) {
							nomedisciplina38 = nome;
							Disciplina disciplina38 = new Disciplina(nomedisciplina38);

						} else if (i == 39) {
							nomedisciplina39 = nome;
							Disciplina disciplina39 = new Disciplina(nomedisciplina39);

						} else if (i == 40) {
							nomedisciplina40 = nome;
							Disciplina disciplina40 = new Disciplina(nomedisciplina40);

						} else if (i == 41) {
							nomedisciplina41 = nome;
							Disciplina disciplina41 = new Disciplina(nomedisciplina41);

						} else if (i == 42) {
							nomedisciplina42 = nome;
							Disciplina disciplina42 = new Disciplina(nomedisciplina42);

						} else if (i == 43) {
							nomedisciplina43 = nome;
							Disciplina disciplina43 = new Disciplina(nomedisciplina43);

						}
					}
					// Print com as informações que o Aluno providenciou.
					Thread.sleep(1000);
					System.out.println("\n============= CADASTRO REALIZADO =============");
					Thread.sleep(1000);
					System.out.println("\n Aluno: " + alunonome + "\n Numero de Matricula: " + matriculaaluno
							+ " \n Disciplinas cursadas: " + numdisciplinas
							+ " disciplinas. \n Semestre atual: " + numsemestre + " semestre");
					System.out.println("\n==============================================");
					Thread.sleep(3000);
					// Como houve inserção de dados por parte do aluno, o booleano cadastro passa a
					// ser verdadeiro, e o booleano menu falso, forçando então o menu 2.
					cadastro = true;
					menu = false;
					break;

				// Opção de Saída do programa pelo menu 1.
				case 9:
					menu = false;
					System.out.println("Você saiu do programa!");
					break;

				// Caso o usuário informe um valor de entrada inválido no menu 1.
				default:
					System.out.println("Valor inválido");
			}

		}

		// Checagem para conferir se houve realmente um cadastro por parte do aluno.
		if (cadastro == true) {
			// Caso o cadastro tenha sido realizado, o aluno então ganha acesso ao menu 2.
			menu2 = true;
			while (menu2) {

				System.out.println("\n============== CARREGANDO DADOS ==============");
				Thread.sleep(3000);
				System.out.println("\nDigite 1  para mostrar todas as disciplinas do curso de ADS: ");
				System.out.println("\nDigite 2  para mostrar todas as disciplinas já cursadas: ");
				System.out.println("\nDigite 3  para mostrar todas as disciplinas pendentes: ");
				System.out.println("\nDigite 9  para Sair:");
				System.out.println("\n==============================================");
				opcao = scan.nextInt();

				switch (opcao) {
					// Opção 1, onde o programa mostra todas as disciplinas do curso
					case 1:
						System.out.println(
								"\n============= Curso de Análise e Desenvolvimento de Sistemas =============");
						Thread.sleep(1000);
						System.out.println("\nSemestre 1 " + semestre1.relatorio());
						Thread.sleep(1000);
						System.out.println("\nSemestre 2 " + semestre2.relatorio());
						Thread.sleep(1000);
						System.out.println("\nSemestre 3 " + semestre3.relatorio());
						Thread.sleep(1000);
						System.out.println("\nSemestre 4 " + semestre4.relatorio());
						Thread.sleep(1000);
						System.out.println("\nSemestre 5 " + semestre5.relatorio());
						Thread.sleep(1000);
						System.out.println("\nSemestre 6 " + semestre6.relatorio());
						System.out.println(
								"\n==========================================================================");

						break;
					// Opção 2, onde o programa mostra todas as disciplinas que o aluno já fez;
					case 2:
						System.out.println(
								"\n============= Curso de Análise e Desenvolvimento de Sistemas =============");
						Thread.sleep(2000);
						System.out.println("\nDisciplinas Cursadas: ");
						for (int i = 1; i <= numdisciplinas; i++) {
							if (i == 1) {
								System.out.println(nomedisciplina1);

							} else if (i == 2) {
								System.out.println(nomedisciplina2);

							} else if (i == 3) {
								System.out.println(nomedisciplina3);

							} else if (i == 4) {
								System.out.println(nomedisciplina4);

							} else if (i == 5) {
								System.out.println(nomedisciplina5);

							} else if (i == 6) {
								System.out.println(nomedisciplina6);

							} else if (i == 7) {
								System.out.println(nomedisciplina7);

							} else if (i == 8) {
								System.out.println(nomedisciplina8);

							} else if (i == 9) {
								System.out.println(nomedisciplina9);

							} else if (i == 10) {
								System.out.println(nomedisciplina10);

							} else if (i == 11) {
								System.out.println(nomedisciplina11);

							} else if (i == 12) {
								System.out.println(nomedisciplina12);

							} else if (i == 13) {
								System.out.println(nomedisciplina13);

							} else if (i == 14) {
								System.out.println(nomedisciplina14);

							} else if (i == 15) {
								System.out.println(nomedisciplina15);

							} else if (i == 16) {
								System.out.println(nomedisciplina16);

							} else if (i == 17) {
								System.out.println(nomedisciplina17);

							} else if (i == 18) {
								System.out.println(nomedisciplina18);

							} else if (i == 19) {
								System.out.println(nomedisciplina19);

							} else if (i == 20) {
								System.out.println(nomedisciplina20);

							} else if (i == 21) {
								System.out.println(nomedisciplina21);

							} else if (i == 22) {
								System.out.println(nomedisciplina22);

							} else if (i == 23) {
								System.out.println(nomedisciplina23);

							} else if (i == 24) {
								System.out.println(nomedisciplina24);

							} else if (i == 25) {
								System.out.println(nomedisciplina25);

							} else if (i == 26) {
								System.out.println(nomedisciplina26);

							} else if (i == 27) {
								System.out.println(nomedisciplina27);

							} else if (i == 28) {
								System.out.println(nomedisciplina28);

							} else if (i == 29) {
								System.out.println(nomedisciplina29);

							} else if (i == 30) {
								System.out.println(nomedisciplina30);

							} else if (i == 31) {
								System.out.println(nomedisciplina31);

							} else if (i == 32) {
								System.out.println(nomedisciplina32);

							} else if (i == 33) {
								System.out.println(nomedisciplina33);

							} else if (i == 34) {
								System.out.println(nomedisciplina34);

							} else if (i == 35) {
								System.out.println(nomedisciplina35);

							} else if (i == 36) {
								System.out.println(nomedisciplina36);

							} else if (i == 37) {
								System.out.println(nomedisciplina37);

							} else if (i == 38) {
								System.out.println(nomedisciplina38);

							} else if (i == 39) {
								System.out.println(nomedisciplina39);

							} else if (i == 40) {
								System.out.println(nomedisciplina40);

							} else if (i == 41) {
								System.out.println(nomedisciplina41);

							} else if (i == 42) {
								System.out.println(nomedisciplina42);

							} else if (i == 43) {
								System.out.println(nomedisciplina43);

							}
						}
						System.out.println(
								"\n==========================================================================");
						Thread.sleep(5000);
						;
						break;

					case 3:
						// Opção 3, onde o programa mostra todas as disciplinas que falta para o aluno
						// fazer.
						// Caso ele informe todas as disciplinas do curso, não irá mostrar nenhuma, pois
						// ele já fez todas as disciplinas possíveis.

						System.out.println(
								"\n============= Curso de Análise e Desenvolvimento de Sistemas =============");
						if (numdisciplinas == 43) {
							System.out.println("\nNão falta mais disciplinas, o aluno já pode se formar!");
							System.out.println(
									"\n==========================================================================");
						}
						System.out.println("\nDisciplinas que faltam para você cursar: ");
						System.out.println("\n");

						// Utilização das strings auxiliares montadas anteriormente.
						// Checa as disciplinas informadas pelo aluno, 1 por 1, comparando se são iguais
						// com as existentes no curso.
						// Caso seja igual a alguma, a variável auxiliar equivalente a disciplina do
						// aluno recebe o valor "disciplina feita".
						// Esse valor "disciplina feita" é o que vai diferenciá-la de uma disciplina não feita depois
						// dessas comparações.

						for (int i = 1; i <= numdisciplinas; i++) {
							if (i == 1) {
								if (faltadisciplina1.equals(nomedisciplina1)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina1)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina1)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina1)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina1)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina1)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina1)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina1)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina1)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina1)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina1)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina1)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina1)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina1)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina1)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina1)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina1)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina1)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina1)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina1)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina1)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina1)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina1)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina1)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina1)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina1)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina1)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina1)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina1)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina1)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina1)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina1)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina1)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina1)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina1)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina1)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina1)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina1)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina1)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina1)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina1)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina1)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina1)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina1)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 2) {
								if (faltadisciplina1.equals(nomedisciplina2)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina2)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina2)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina2)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina2)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina2)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina2)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina2)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina2)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina2)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina2)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina2)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina2)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina2)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina2)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina2)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina2)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina2)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina2)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina2)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina2)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina2)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina2)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina2)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina2)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina2)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina2)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina2)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina2)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina2)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina2)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina2)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina2)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina2)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina2)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina2)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina2)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina2)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina2)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina2)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina2)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina2)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina2)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina2)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 3) {
								if (faltadisciplina1.equals(nomedisciplina3)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina3)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina3)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina3)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina3)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina3)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina3)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina3)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina3)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina3)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina3)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina3)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina3)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina3)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina3)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina3)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina3)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina3)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina3)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina3)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina3)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina3)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina3)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina3)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina3)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina3)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina3)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina3)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina3)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina3)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina3)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina3)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina3)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina3)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina3)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina3)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina3)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina3)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina3)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina3)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina3)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina3)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina3)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina3)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 4) {
								if (faltadisciplina1.equals(nomedisciplina4)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina4)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina4)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina4)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina4)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina4)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina4)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina4)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina4)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina4)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina4)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina4)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina4)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina4)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina4)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina4)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina4)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina4)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina4)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina4)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina4)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina4)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina4)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina4)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina4)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina4)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina4)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina4)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina4)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina4)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina4)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina4)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina4)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina4)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina4)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina4)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina4)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina4)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina4)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina4)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina4)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina4)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina4)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina4)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 5) {
								if (faltadisciplina1.equals(nomedisciplina5)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina5)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina5)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina5)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina5)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina5)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina5)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina5)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina5)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina5)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina5)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina5)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina5)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina5)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina5)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina5)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina5)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina5)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina5)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina5)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina5)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina5)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina5)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina5)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina5)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina5)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina5)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina5)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina5)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina5)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina5)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina5)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina5)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina5)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina5)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina5)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina5)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina5)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina5)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina5)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina5)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina5)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina5)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina5)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 6) {
								if (faltadisciplina1.equals(nomedisciplina6)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina6)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina6)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina6)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina6)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina6)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina6)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina6)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina6)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina6)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina6)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina6)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina6)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina6)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina6)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina6)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina6)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina6)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina6)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina6)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina6)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina6)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina6)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina6)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina6)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina6)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina6)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina6)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina6)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina6)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina6)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina6)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina6)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina6)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina6)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina6)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina6)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina6)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina6)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina6)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina6)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina6)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina6)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina6)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 7) {
								if (faltadisciplina1.equals(nomedisciplina7)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina7)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina7)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina7)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina7)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina7)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina7)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina7)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina7)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina7)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina7)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina7)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina7)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina7)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina7)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina7)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina7)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina7)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina7)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina7)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina7)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina7)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina7)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina7)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina7)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina7)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina7)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina7)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina7)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina7)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina7)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina7)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina7)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina7)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina7)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina7)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina7)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina7)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina7)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina7)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina7)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina7)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina7)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina7)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 8) {
								if (faltadisciplina1.equals(nomedisciplina8)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina8)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina8)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina8)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina8)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina8)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina8)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina8)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina8)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina8)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina8)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina8)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina8)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina8)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina8)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina8)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina8)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina8)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina8)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina8)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina8)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina8)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina8)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina8)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina8)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina8)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina8)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina8)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina8)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina8)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina8)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina8)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina8)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina8)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina8)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina8)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina8)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina8)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina8)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina8)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina8)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina8)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina8)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina8)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}
								
							} else if (i == 9) {
								if (faltadisciplina1.equals(nomedisciplina9)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina9)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina9)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina9)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina9)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina9)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina9)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina9)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina9)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina9)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina9)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina9)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina9)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina9)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina9)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina9)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina9)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina9)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina9)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina9)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina9)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina9)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina9)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina9)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina9)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina9)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina9)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina9)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina9)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina9)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina9)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina9)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina9)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina9)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina9)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina9)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina9)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina9)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina9)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina9)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina9)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina9)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina9)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina9)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 10) {
								if (faltadisciplina1.equals(nomedisciplina10)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina10)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina10)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina10)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina10)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina10)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina10)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina10)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina10)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina10)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina10)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina10)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina10)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina10)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina10)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina10)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina10)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina10)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina10)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina10)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina10)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina10)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina10)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina10)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina10)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina10)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina10)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina10)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina10)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina10)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina10)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina10)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina10)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina10)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina10)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina10)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina10)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina10)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina10)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina10)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina10)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina10)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina10)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina10)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 11) {
								if (faltadisciplina1.equals(nomedisciplina11)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina11)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina11)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina11)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina11)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina11)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina11)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina11)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina11)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina11)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina11)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina11)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina11)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina11)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina11)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina11)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina11)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina11)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina11)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina11)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina11)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina11)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina11)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina11)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina11)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina11)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina11)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina11)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina11)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina11)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina11)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina11)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina11)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina11)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina11)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina11)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina11)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina11)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina11)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina11)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina11)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina11)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina11)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina11)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 12) {
								if (faltadisciplina1.equals(nomedisciplina12)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina12)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina12)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina12)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina12)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina12)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina12)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina12)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina12)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina12)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina12)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina12)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina12)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina12)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina12)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina12)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina12)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina12)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina12)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina12)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina12)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina12)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina12)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina12)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina12)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina12)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina12)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina12)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina12)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina12)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina12)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina12)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina12)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina12)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina12)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina12)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina12)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina12)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina12)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina12)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina12)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina12)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina12)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina12)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 13) {
								if (faltadisciplina1.equals(nomedisciplina13)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina13)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina13)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina13)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina13)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina13)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina13)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina13)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina13)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina13)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina13)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina13)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina13)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina13)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina13)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina13)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina13)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina13)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina13)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina13)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina13)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina13)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina13)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina13)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina13)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina13)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina13)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina13)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina13)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina13)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina13)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina13)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina13)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina13)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina13)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina13)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina13)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina13)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina13)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina13)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina13)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina13)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina13)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina13)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 14) {
								if (faltadisciplina1.equals(nomedisciplina14)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina14)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina14)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina14)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina14)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina14)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina14)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina14)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina14)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina14)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina14)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina14)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina14)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina14)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina14)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina14)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina14)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina14)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina14)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina14)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina14)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina14)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina14)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina14)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina14)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina14)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina14)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina14)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina14)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina14)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina14)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina14)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina14)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina14)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina14)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina14)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina14)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina14)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina14)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina14)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina14)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina14)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina14)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina14)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 15) {
								if (faltadisciplina1.equals(nomedisciplina15)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina15)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina15)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina15)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina15)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina15)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina15)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina15)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina15)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina15)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina15)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina15)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina15)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina15)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina15)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina15)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina15)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina15)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina15)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina15)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina15)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina15)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina15)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina15)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina15)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina15)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina15)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina15)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina15)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina15)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina15)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina15)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina15)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina15)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina15)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina15)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina15)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina15)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina15)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina15)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina15)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina15)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina15)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina15)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 16) {
								if (faltadisciplina1.equals(nomedisciplina16)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina16)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina16)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina16)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina16)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina16)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina16)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina16)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina16)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina16)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina16)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina16)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina16)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina16)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina16)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina16)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina16)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina16)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina16)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina16)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina16)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina16)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina16)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina16)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina16)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina16)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina16)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina16)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina16)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina16)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina16)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina16)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina16)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina16)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina16)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina16)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina16)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina16)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina16)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina16)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina16)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina16)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina16)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina16)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 17) {
								if (faltadisciplina1.equals(nomedisciplina17)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina17)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina17)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina17)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina17)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina17)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina17)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina17)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina17)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina17)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina17)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina17)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina17)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina17)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina17)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina17)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina17)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina17)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina17)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina17)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina17)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina17)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina17)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina17)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina17)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina17)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina17)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina17)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina17)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina17)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina17)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina17)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina17)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina17)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina17)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina17)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina17)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina17)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina17)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina17)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina17)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina17)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina17)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina17)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 18) {
								if (faltadisciplina1.equals(nomedisciplina18)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina18)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina18)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina18)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina18)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina18)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina18)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina18)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina18)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina18)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina18)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina18)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina18)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina18)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina18)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina18)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina18)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina18)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina18)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina18)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina18)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina18)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina18)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina18)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina18)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina18)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina18)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina18)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina18)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina18)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina18)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina18)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina18)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina18)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina18)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina18)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina18)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina18)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina18)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina18)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina18)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina18)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina18)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina18)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 19) {
								if (faltadisciplina1.equals(nomedisciplina19)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina19)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina19)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina19)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina19)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina19)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina19)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina19)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina19)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina19)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina19)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina19)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina19)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina19)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina19)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina19)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina19)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina19)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina19)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina19)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina19)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina19)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina19)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina19)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina19)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina19)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina19)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina19)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina19)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina19)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina19)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina19)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina19)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina19)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina19)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina19)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina19)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina19)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina19)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina19)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina19)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina19)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina19)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina19)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 20) {
								if (faltadisciplina1.equals(nomedisciplina20)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina20)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina20)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina20)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina20)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina20)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina20)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina20)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina20)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina20)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina20)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina20)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina20)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina20)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina20)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina20)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina20)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina20)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina20)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina20)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina20)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina20)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina20)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina20)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina20)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina20)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina20)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina20)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina20)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina20)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina20)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina20)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina20)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina20)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina20)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina20)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina20)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina20)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina20)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina20)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina20)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina20)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina20)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina20)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 21) {
								if (faltadisciplina1.equals(nomedisciplina21)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina21)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina21)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina21)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina21)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina21)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina21)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina21)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina21)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina21)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina21)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina21)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina21)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina21)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina21)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina21)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina21)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina21)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina21)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina21)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina21)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina21)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina21)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina21)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina21)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina21)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina21)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina21)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina21)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina21)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina21)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina21)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina21)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina21)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina21)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina21)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina21)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina21)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina21)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina21)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina21)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina21)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina21)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina21)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 22) {
								if (faltadisciplina1.equals(nomedisciplina22)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina22)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina22)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina22)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina22)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina22)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina22)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina22)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina22)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina22)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina22)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina22)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina22)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina22)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina22)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina22)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina22)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina22)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina22)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina22)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina22)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina22)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina22)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina22)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina22)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina22)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina22)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina22)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina22)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina22)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina22)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina22)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina22)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina22)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina22)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina22)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina22)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina22)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina22)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina22)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina22)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina22)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina22)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina22)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 23) {
								if (faltadisciplina1.equals(nomedisciplina23)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina23)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina23)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina23)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina23)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina23)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina23)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina23)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina23)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina23)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina23)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina23)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina23)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina23)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina23)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina23)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina23)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina23)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina23)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina23)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina23)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina23)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina23)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina23)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina23)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina23)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina23)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina23)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina23)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina23)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina23)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina23)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina23)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina23)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina23)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina23)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina23)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina23)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina23)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina23)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina23)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina23)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina23)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina23)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 24) {
								if (faltadisciplina1.equals(nomedisciplina24)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina24)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina24)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina24)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina24)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina24)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina24)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina24)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina24)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina24)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina24)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina24)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina24)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina24)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina24)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina24)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina24)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina24)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina24)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina24)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina24)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina24)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina24)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina24)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina24)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina24)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina24)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina24)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina24)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina24)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina24)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina24)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina24)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina24)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina24)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina24)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina24)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina24)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina24)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina24)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina24)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina24)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina24)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina24)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 25) {
								if (faltadisciplina1.equals(nomedisciplina25)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina25)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina25)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina25)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina25)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina25)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina25)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina25)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina25)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina25)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina25)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina25)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina25)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina25)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina25)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina25)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina25)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina25)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina25)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina25)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina25)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina25)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina25)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina25)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina25)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina25)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina25)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina25)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina25)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina25)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina25)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina25)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina25)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina25)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina25)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina25)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina25)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina25)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina25)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina25)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina25)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina25)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina25)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina25)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 26) {
								if (faltadisciplina1.equals(nomedisciplina26)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina26)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina26)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina26)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina26)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina26)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina26)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina26)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina26)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina26)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina26)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina26)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina26)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina26)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina26)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina26)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina26)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina26)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina26)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina26)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina26)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina26)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina26)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina26)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina26)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina26)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina26)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina26)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina26)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina26)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina26)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina26)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina26)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina26)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina26)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina26)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina26)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina26)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina26)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina26)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina26)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina26)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina26)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina26)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 27) {
								if (faltadisciplina1.equals(nomedisciplina27)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina27)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina27)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina27)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina27)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina27)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina27)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina27)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina27)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina27)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina27)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina27)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina27)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina27)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina27)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina27)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina27)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina27)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina27)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina27)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina27)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina27)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina27)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina27)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina27)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina27)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina27)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina27)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina27)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina27)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina27)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina27)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina27)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina27)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina27)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina27)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina27)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina27)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina27)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina27)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina27)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina27)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina27)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina27)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 28) {
								if (faltadisciplina1.equals(nomedisciplina28)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina28)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina28)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina28)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina28)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina28)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina28)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina28)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina28)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina28)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina28)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina28)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina28)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina28)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina28)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina28)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina28)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina28)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina28)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina28)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina28)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina28)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina28)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina28)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina28)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina28)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina28)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina28)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina28)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina28)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina28)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina28)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina28)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina28)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina28)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina28)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina28)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina28)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina28)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina28)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina28)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina28)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina28)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina28)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 29) {
								if (faltadisciplina1.equals(nomedisciplina29)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina29)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina29)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina29)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina29)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina29)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina29)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina29)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina29)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina29)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina29)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina29)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina29)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina29)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina29)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina29)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina29)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina29)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina29)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina29)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina29)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina29)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina29)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina29)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina29)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina29)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina29)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina29)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina29)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina29)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina29)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina29)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina29)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina29)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina29)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina29)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina29)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina29)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina29)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina29)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina29)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina29)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina29)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina29)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 30) {
								if (faltadisciplina1.equals(nomedisciplina30)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina30)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina30)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina30)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina30)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina30)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina30)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina30)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina30)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina30)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina30)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina30)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina30)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina30)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina30)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina30)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina30)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina30)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina30)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina30)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina30)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina30)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina30)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina30)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina30)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina30)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina30)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina30)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina30)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina30)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina30)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina30)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina30)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina30)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina30)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina30)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina30)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina30)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina30)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina30)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina30)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina30)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina30)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina30)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 31) {
								if (faltadisciplina1.equals(nomedisciplina31)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina31)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina31)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina31)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina31)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina31)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina31)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina31)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina31)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina31)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina31)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina31)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina31)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina31)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina31)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina31)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina31)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina31)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina31)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina31)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina31)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina31)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina31)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina31)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina31)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina31)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina31)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina31)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina31)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina31)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina31)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina31)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina31)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina31)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina31)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina31)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina31)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina31)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina31)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina31)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina31)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina31)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina31)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina31)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 32) {
								if (faltadisciplina1.equals(nomedisciplina32)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina32)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina32)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina32)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina32)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina32)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina32)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina32)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina32)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina32)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina32)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina32)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina32)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina32)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina32)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina32)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina32)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina32)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina32)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina32)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina32)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina32)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina32)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina32)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina32)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina32)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina32)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina32)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina32)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina32)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina32)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina32)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina32)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina32)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina32)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina32)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina32)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina32)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina32)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina32)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina32)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina32)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina32)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina32)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 33) {
								if (faltadisciplina1.equals(nomedisciplina33)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina33)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina33)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina33)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina33)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina33)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina33)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina33)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina33)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina33)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina33)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina33)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina33)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina33)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina33)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina33)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina33)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina33)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina33)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina33)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina33)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina33)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina33)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina33)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina33)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina33)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina33)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina33)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina33)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina33)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina33)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina33)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina33)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina33)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina33)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina33)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina33)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina33)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina33)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina33)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina33)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina33)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina33)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina33)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 34) {
								if (faltadisciplina1.equals(nomedisciplina34)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina34)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina34)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina34)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina34)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina34)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina34)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina34)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina34)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina34)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina34)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina34)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina34)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina34)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina34)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina34)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina34)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina34)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina34)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina34)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina34)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina34)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina34)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina34)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina34)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina34)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina34)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina34)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina34)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina34)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina34)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina34)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina34)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina34)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina34)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina34)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina34)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina34)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina34)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina34)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina34)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina34)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina34)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina34)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 35) {
								if (faltadisciplina1.equals(nomedisciplina35)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina35)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina35)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina35)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina35)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina35)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina35)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina35)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina35)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina35)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina35)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina35)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina35)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina35)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina35)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina35)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina35)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina35)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina35)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina35)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina35)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina35)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina35)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina35)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina35)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina35)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina35)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina35)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina35)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina35)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina35)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina35)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina35)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina35)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina35)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina35)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina35)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina35)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina35)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina35)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina35)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina35)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina35)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina35)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 36) {
								if (faltadisciplina1.equals(nomedisciplina36)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina36)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina36)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina36)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina36)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina36)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina36)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina36)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina36)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina36)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina36)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina36)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina36)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina36)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina36)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina36)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina36)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina36)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina36)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina36)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina36)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina36)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina36)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina36)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina36)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina36)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina36)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina36)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina36)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina36)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina36)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina36)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina36)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina36)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina36)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina36)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina36)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina36)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina36)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina36)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina36)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina36)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina36)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina36)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 37) {
								if (faltadisciplina1.equals(nomedisciplina37)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina37)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina37)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina37)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina37)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina37)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina37)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina37)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina37)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina37)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina37)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina37)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina37)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina37)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina37)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina37)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina37)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina37)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina37)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina37)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina37)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina37)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina37)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina37)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina37)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina37)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina37)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina37)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina37)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina37)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina37)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina37)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina37)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina37)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina37)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina37)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina37)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina37)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina37)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina37)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina37)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina37)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina37)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina37)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 38) {
								if (faltadisciplina1.equals(nomedisciplina38)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina38)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina38)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina38)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina38)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina38)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina38)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina38)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina38)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina38)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina38)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina38)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina38)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina38)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina38)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina38)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina38)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina38)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina38)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina38)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina38)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina38)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina38)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina38)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina38)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina38)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina38)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina38)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina38)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina38)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina38)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina38)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina38)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina38)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina38)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina38)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina38)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina38)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina38)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina38)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina38)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina38)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina38)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina38)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}

							} else if (i == 39) {
								if (faltadisciplina1.equals(nomedisciplina39)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina39)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina39)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina39)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina39)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina39)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina39)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina39)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina39)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina39)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina39)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina39)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina39)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina39)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina39)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina39)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina39)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina39)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina39)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina39)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina39)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina39)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina39)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina39)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina39)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina39)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina39)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina39)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina39)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina39)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina39)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina39)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina39)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina39)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina39)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina39)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina39)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina39)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina39)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina39)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina39)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina39)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina39)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina39)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 40) {
								if (faltadisciplina1.equals(nomedisciplina40)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina40)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina40)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina40)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina40)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina40)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina40)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina40)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina40)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina40)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina40)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina40)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina40)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina40)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina40)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina40)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina40)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina40)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina40)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina40)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina40)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina40)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina40)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina40)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina40)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina40)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina40)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina40)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina40)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina40)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina40)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina40)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina40)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina40)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina40)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina40)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina40)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina40)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina40)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina40)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina40)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina40)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina40)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina40)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 41) {
								if (faltadisciplina1.equals(nomedisciplina41)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina41)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina41)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina41)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina41)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina41)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina41)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina41)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina41)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina41)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina41)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina41)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina41)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina41)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina41)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina41)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina41)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina41)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina41)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina41)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina41)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina41)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina41)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina41)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina41)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina41)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina41)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina41)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina41)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina41)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina41)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina41)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina41)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina41)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina41)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina41)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina41)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina41)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina41)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina41)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina41)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina41)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina41)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina41)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 42) {
								if (faltadisciplina1.equals(nomedisciplina42)) {
									faltadisciplina1 = "disciplina feita";
								}  if (faltadisciplina2.equals(nomedisciplina42)) {
									faltadisciplina2 = "disciplina feita";
								}  if (faltadisciplina3.equals(nomedisciplina42)) {
									faltadisciplina3 = "disciplina feita";
								}  if (faltadisciplina4.equals(nomedisciplina42)) {
									faltadisciplina4 = "disciplina feita";
								}  if (faltadisciplina5.equals(nomedisciplina42)) {
									faltadisciplina5 = "disciplina feita";
								}  if (faltadisciplina6.equals(nomedisciplina42)) {
									faltadisciplina6 = "disciplina feita";
								}  if (faltadisciplina7.equals(nomedisciplina42)) {
									faltadisciplina7 = "disciplina feita";
								}  if (faltadisciplina8.equals(nomedisciplina42)) {
									faltadisciplina8 = "disciplina feita";
								}  if (faltadisciplina9.equals(nomedisciplina42)) {
									faltadisciplina9 = "disciplina feita";
								}  if (faltadisciplina10.equals(nomedisciplina42)) {
									faltadisciplina10 = "disciplina feita";
								}  if (faltadisciplina11.equals(nomedisciplina42)) {
									faltadisciplina11 = "disciplina feita";
								}  if (faltadisciplina12.equals(nomedisciplina42)) {
									faltadisciplina12 = "disciplina feita";
								}  if (faltadisciplina13.equals(nomedisciplina42)) {
									faltadisciplina13 = "disciplina feita";
								}  if (faltadisciplina14.equals(nomedisciplina42)) {
									faltadisciplina14 = "disciplina feita";
								}  if (faltadisciplina15.equals(nomedisciplina42)) {
									faltadisciplina15 = "disciplina feita";
								}  if (faltadisciplina16.equals(nomedisciplina42)) {
									faltadisciplina16 = "disciplina feita";
								}  if (faltadisciplina17.equals(nomedisciplina42)) {
									faltadisciplina17 = "disciplina feita";
								}  if (faltadisciplina18.equals(nomedisciplina42)) {
									faltadisciplina18 = "disciplina feita";
								}  if (faltadisciplina19.equals(nomedisciplina42)) {
									faltadisciplina19 = "disciplina feita";
								}  if (faltadisciplina20.equals(nomedisciplina42)) {
									faltadisciplina20 = "disciplina feita";
								}  if (faltadisciplina21.equals(nomedisciplina42)) {
									faltadisciplina21 = "disciplina feita";
								} if (faltadisciplina22.equals(nomedisciplina42)) {
									faltadisciplina22 = "disciplina feita";
								}  if (faltadisciplina23.equals(nomedisciplina42)) {
									faltadisciplina23 = "disciplina feita";
								}  if (faltadisciplina24.equals(nomedisciplina42)) {
									faltadisciplina24 = "disciplina feita";
								}  if (faltadisciplina25.equals(nomedisciplina42)) {
									faltadisciplina25 = "disciplina feita";
								}  if (faltadisciplina26.equals(nomedisciplina42)) {
									faltadisciplina26 = "disciplina feita";
								}  if (faltadisciplina27.equals(nomedisciplina42)) {
									faltadisciplina27 = "disciplina feita";
								}  if (faltadisciplina28.equals(nomedisciplina42)) {
									faltadisciplina28 = "disciplina feita";
								}  if (faltadisciplina29.equals(nomedisciplina42)) {
									faltadisciplina29 = "disciplina feita";
								}  if (faltadisciplina30.equals(nomedisciplina42)) {
									faltadisciplina30 = "disciplina feita";
								}  if (faltadisciplina31.equals(nomedisciplina42)) {
									faltadisciplina31 = "disciplina feita";
								} if (faltadisciplina32.equals(nomedisciplina42)) {
									faltadisciplina32 = "disciplina feita";
								}  if (faltadisciplina33.equals(nomedisciplina42)) {
									faltadisciplina33 = "disciplina feita";
								}  if (faltadisciplina34.equals(nomedisciplina42)) {
									faltadisciplina34 = "disciplina feita";
								}  if (faltadisciplina35.equals(nomedisciplina42)) {
									faltadisciplina35 = "disciplina feita";
								}  if (faltadisciplina36.equals(nomedisciplina42)) {
									faltadisciplina36 = "disciplina feita";
								}  if (faltadisciplina37.equals(nomedisciplina42)) {
									faltadisciplina37 = "disciplina feita";
								}  if (faltadisciplina38.equals(nomedisciplina42)) {
									faltadisciplina38 = "disciplina feita";
								}  if (faltadisciplina39.equals(nomedisciplina42)) {
									faltadisciplina39 = "disciplina feita";
								}  if (faltadisciplina40.equals(nomedisciplina42)) {
									faltadisciplina40 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina42)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina41.equals(nomedisciplina42)) {
									faltadisciplina41 = "disciplina feita";
								}  if (faltadisciplina42.equals(nomedisciplina42)) {
									faltadisciplina42 = "disciplina feita";
								}  if (faltadisciplina43.equals(nomedisciplina42)) {
									faltadisciplina43 = "disciplina feita";
								} else {
									continue;
								}


							} else if (i == 43) {
								break;
							}
						}

						// Agora, é que o programa mostra as disciplinas que faltam ser cursadas
						// Como utilizamos as disciplinas informadas pelo aluno para "anular" as strings
						// auxiliares,
						// Se houver alguma string com valor diferente de "disciplina feita", significa que o aluno
						// ainda não a fez.
						// Então, o programa a imprime na tela.
						// Aqui foi usado 43 no laço for ao invés do numdisciplina informado pelo aluno,
						// pois 43 é o número total de disciplinas do curso.
						// Assim, temos certeza de que todas as disciplinas serão impressas na tela,
						// mesmo que o usuário tenha cursado apenas 1 disciplina.

						for (int i = 1; i <= 43; i++) {
							if (i == 1) {
								if (faltadisciplina1 != "disciplina feita") {
									System.out.println(faltadisciplina1);
								} else {
									continue;
								}

							} else if (i == 2) {
								if (faltadisciplina2 != "disciplina feita") {
									System.out.println(faltadisciplina2);
								} else {
									continue;
								}

							} else if (i == 3) {
								if (faltadisciplina3 != "disciplina feita") {
									System.out.println(faltadisciplina3);
								} else {
									continue;
								}

							} else if (i == 4) {
								if (faltadisciplina4 != "disciplina feita") {
									System.out.println(faltadisciplina4);
								} else {
									continue;
								}

							} else if (i == 5) {
								if (faltadisciplina5 != "disciplina feita") {
									System.out.println(faltadisciplina5);
								} else {
									continue;
								}

							} else if (i == 6) {
								if (faltadisciplina6 != "disciplina feita") {
									System.out.println(faltadisciplina6);
								} else {
									continue;
								}

							} else if (i == 7) {
								if (faltadisciplina7 != "disciplina feita") {
									System.out.println(faltadisciplina7);
								}

								else {
									continue;
								}

							} else if (i == 8) {
								if (faltadisciplina8 != "disciplina feita") {
									System.out.println(faltadisciplina8);
								} else {
									continue;
								}

							} else if (i == 9) {
								if (faltadisciplina9 != "disciplina feita") {
									System.out.println(faltadisciplina9);
								} else {
									continue;
								}
							} else if (i == 10) {
								if (faltadisciplina10 != "disciplina feita") {
									System.out.println(faltadisciplina10);
								} else {
									continue;
								}
							} else if (i == 11) {
								if (faltadisciplina11 != "disciplina feita") {
									System.out.println(faltadisciplina11);
								} else {
									continue;
								}

							} else if (i == 12) {
								if (faltadisciplina12 != "disciplina feita") {
									System.out.println(faltadisciplina12);
								} else {
									continue;
								}

							} else if (i == 13) {
								if (faltadisciplina13 != "disciplina feita") {
									System.out.println(faltadisciplina13);
								} else {
									continue;
								}

							} else if (i == 14) {
								if (faltadisciplina14 != "disciplina feita") {
									System.out.println(faltadisciplina14);
								} else {
									continue;
								}

							} else if (i == 15) {
								if (faltadisciplina15 != "disciplina feita") {
									System.out.println(faltadisciplina15);
								} else {
									continue;
								}

							} else if (i == 16) {
								if (faltadisciplina16 != "disciplina feita") {
									System.out.println(faltadisciplina16);
								}

								else {
									continue;
								}

							} else if (i == 17) {
								if (faltadisciplina17 != "disciplina feita") {
									System.out.println(faltadisciplina17);
								} else {
									continue;
								}

							} else if (i == 18) {
								if (faltadisciplina18 != "disciplina feita") {
									System.out.println(faltadisciplina18);
								} else {
									continue;
								}
							} else if (i == 19) {
								if (faltadisciplina19 != "disciplina feita") {
									System.out.println(faltadisciplina19);
								} else {
									continue;
								}
							} else if (i == 20) {
								if (faltadisciplina20 != "disciplina feita") {
									System.out.println(faltadisciplina20);
								} else {
									continue;
								}
							} else if (i == 21) {
								if (faltadisciplina21 != "disciplina feita") {
									System.out.println(faltadisciplina21);
								} else {
									continue;
								}

							} else if (i == 22) {
								if (faltadisciplina22 != "disciplina feita") {
									System.out.println(faltadisciplina22);
								} else {
									continue;
								}

							} else if (i == 23) {
								if (faltadisciplina23 != "disciplina feita") {
									System.out.println(faltadisciplina23);
								} else {
									continue;
								}

							} else if (i == 24) {
								if (faltadisciplina24 != "disciplina feita") {
									System.out.println(faltadisciplina24);
								} else {
									continue;
								}

							} else if (i == 25) {
								if (faltadisciplina25 != "disciplina feita") {
									System.out.println(faltadisciplina25);
								} else {
									continue;
								}

							} else if (i == 26) {
								if (faltadisciplina26 != "disciplina feita") {
									System.out.println(faltadisciplina26);
								}

								else {
									continue;
								}

							} else if (i == 27) {
								if (faltadisciplina27 != "disciplina feita") {
									System.out.println(faltadisciplina27);
								} else {
									continue;
								}

							} else if (i == 28) {
								if (faltadisciplina28 != "disciplina feita") {
									System.out.println(faltadisciplina28);
								} else {
									continue;
								}
							} else if (i == 29) {
								if (faltadisciplina29 != "disciplina feita") {
									System.out.println(faltadisciplina29);
								} else {
									continue;
								}
							} else if (i == 30) {
								if (faltadisciplina30 != "disciplina feita") {
									System.out.println(faltadisciplina30);
								} else {
									continue;
								}
							} else if (i == 31) {
								if (faltadisciplina31 != "disciplina feita") {
									System.out.println(faltadisciplina31);
								} else {
									continue;
								}

							} else if (i == 32) {
								if (faltadisciplina32 != "disciplina feita") {
									System.out.println(faltadisciplina32);
								} else {
									continue;
								}

							} else if (i == 33) {
								if (faltadisciplina33 != "disciplina feita") {
									System.out.println(faltadisciplina33);
								} else {
									continue;
								}

							} else if (i == 34) {
								if (faltadisciplina34 != "disciplina feita") {
									System.out.println(faltadisciplina34);
								} else {
									continue;
								}

							} else if (i == 35) {
								if (faltadisciplina35 != "disciplina feita") {
									System.out.println(faltadisciplina35);
								} else {
									continue;
								}

							} else if (i == 36) {
								if (faltadisciplina36 != "disciplina feita") {
									System.out.println(faltadisciplina36);
								}

								else {
									continue;
								}

							} else if (i == 37) {
								if (faltadisciplina37 != "disciplina feita") {
									System.out.println(faltadisciplina37);
								} else {
									continue;
								}

							} else if (i == 38) {
								if (faltadisciplina38 != "disciplina feita") {
									System.out.println(faltadisciplina38);
								} else {
									continue;
								}
							} else if (i == 39) {
								if (faltadisciplina39 != "disciplina feita") {
									System.out.println(faltadisciplina39);
								} else {
									continue;
								}
							} else if (i == 40) {
								if (faltadisciplina40 != "disciplina feita") {
									System.out.println(faltadisciplina40);
								} else {
									continue;
								}
							} else if (i == 41) {
								if (faltadisciplina31 != "disciplina feita") {
									System.out.println(faltadisciplina41);
								} else {
									continue;
								}

							} else if (i == 42) {
								if (faltadisciplina32 != "disciplina feita") {
									System.out.println(faltadisciplina42);
								} else {
									continue;
								}

							} else if (i == 43) {
								break;
							}
						}
						System.out.println(
								"\n==========================================================================");
						Thread.sleep(5000);
						;
						break;

					// Opção para sair do programa pelo menu 2.
					case 9:
						menu2 = false;
						System.out.println("Você saiu do programa!");
						break;
					// Opção caso o usuário informe algum valor inválido no menu 2.
					default:
						System.out.println("Valor inválido");
				}
			}
		}
		// Fechando a função Scanner
		scan.close();
	}
}

// Fim do programa.
// Como não deveríamos usar vetores e / ou arrays, essas inúmeras comparações
// foi a maneira que o grupo encontrou de garantir a funcionalidade plena do
// código.