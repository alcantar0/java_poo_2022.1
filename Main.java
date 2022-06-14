import java.util.Scanner;
import java.util.LinkedList;

class Main{
	public static void main(String[] args) {

		String adm_username = "admin";
		String adm_senha = "admin";

		int est_size=0;
		int prof_size = 0;
		int dis_size = 0;

		Scanner myObj = new Scanner(System.in);

		LinkedList <Estudante> estudantes = new LinkedList<>();
		LinkedList <Professor> professores = new LinkedList<>();
		LinkedList <Disciplina> disciplinas = new LinkedList<>();


		//Professor pit = new Professor(145, "Pitagoras", 4000);

		//Disciplina poo = new Disciplina("POO", pit);

		//Disciplina lp = new Disciplina("Linguagens de programação", pit);

		//Estudante pedro = new Estudante();

		/*professores.add(pit);
		estudantes.add(pedro);
		disciplinas.add(lp);
		disciplinas.add(poo);
		est_size+=1;
		prof_size+=1;
		dis_size+=1;*/

		//pedro.matricular_disciplina(poo);

		//Disciplina p = pedro.selecionar_disciplina();
		//System.out.println("aqui "+p.get_nome());

		//pedro.listar_notas();

		//System.out.println(poo.get_professor());

		System.out.println("Bem-vindo ao SIGAB");
		System.out.println("Escolha: \n[0] Aluno \n[1] Professor \n[2] Administrador");
		int p1 = myObj.nextInt();
		boolean verificador_est = true;

		if (p1==0) {
			Scanner myObj2 = new Scanner(System.in);
			Estudante student=null;

			boolean existe = false;
			do{
				System.out.println("Digite seu username: ");
				String username = myObj2.nextLine();
				for (int i=0; i<est_size; i++) {
					if(estudantes.get(i).get_nome().equals(username)){
						existe=true;
						student = estudantes.get(i);
					}
					else{
						System.out.println("Estudante não encontrado, tente novamente.");
						existe=false;
					}
				}
			}while(existe==false);

			System.out.println("Digite a senha");
			String senha = myObj2.nextLine();
			if(student.comparar_senhas(senha)==true){
				System.out.println("Login feito com sucesso!");
			}
			else{
				System.out.println("Acesso negado! ");
				verificador_est = false;
				System.exit(0);

			}
			student.selecionar_disciplina();
		}
		else if (p1==1) {
			Scanner myObj2 = new Scanner(System.in);
			Professor prof=null;

			boolean existe = false;
			do{
				System.out.println("Digite seu username: ");
				String username = myObj2.nextLine();
				for (int i=0; i<est_size; i++) {
					if(professores.get(i).get_nome().equals(username)){
						existe=true;
						prof = professores.get(i);
						System.out.println("aqui");
					}
					else{
						System.out.println("Professor não encontrado, tente novamente.");
						existe=false;
					}
				}
			}while(existe==false);

			System.out.println("Digite a senha");
			String senha = myObj2.nextLine();
			if(prof.comparar_senhas(senha)==true){
				System.out.println("Login feito com sucesso!");
			}
			else{
				System.out.println("Acesso negado! ");
				verificador_est = false;
				System.exit(0);

			}
		int verificador_prof;

		do{
					System.out.println("[0] Cadastrar professor\n[1] Cadastrar aluno\n[2] Cadastrar disciplina.\n[3] Sair");

			System.out.println("[0] Cadastrar notas de alunos\n[1] Cadastrar alunos à disciplina\n[2] Cadastrar aluno.\n[3] Sair");
			verificador_prof = myObj.nextInt();
			if (verificador_prof==0) {
				Estudante novo_estudante = new Estudante();
				estudantes.add(novo_estudante);
				est_size+=1;
			}
			//else if (verificador_prof==1) {
				//prof.cadastrar_notas();
			//}


		}while(verificador_prof!=3);

	}
	else if (p1==2) {
		Scanner myObj2 = new Scanner(System.in);

		boolean encontrado = false;
		do{
		System.out.println("Digite seu username: ");
		String username = myObj2.nextLine();
		System.out.println("Digite a senha: ");
		String senha = myObj2.nextLine();
		if (adm_username.equals(username) && adm_senha.equals(senha)) {
			encontrado=true;
		}
		else{
			System.out.println("Dados incorretos, tente novamente.");
		}
		}while(encontrado==false);

		int verificador_prof;
		do{
			System.out.println("[0] Cadastrar professor\n[1] Cadastrar aluno\n[2] Cadastrar disciplina.\n[3] Sair");
			verificador_prof = myObj.nextInt();
			if (verificador_prof==0) {
				Professor novo_professor = new Professor();
				professores.add(novo_professor);
				prof_size+=1;
			}
			//else if (verificador_prof==1) {
				//prof.cadastrar_notas();
			//}


		}while(verificador_prof!=3);



	}

		}

	}
