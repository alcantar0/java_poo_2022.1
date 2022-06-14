import java.util.Scanner;
class Estudante extends Instituicao{
	Scanner myObj = new Scanner(System.in);
	Scanner myObj2 = new Scanner(System.in);

	private int matricula, idade;
	private String nome;
	private String senha;

	private Disciplina[] disciplinas = new Disciplina[10];
	private int pointer_disciplinas=0;

	public Estudante(){
		this.matricula = gerar_matricula();
		System.out.println("Digite sua idade: ");
		this.idade = myObj.nextInt();
		System.out.println("Digite seu nome: ");
		this.nome = myObj2.nextLine();
		System.out.println("Digite sua nova senha: ");
		this.senha = myObj2.nextLine();
	}
	public boolean comparar_senhas(String tentativa){
		if (senha.equals(tentativa)) {
			return true;
		}
		else{
			return false;
		}
	}


	public String get_nome(){
		return nome;
	}
	public void get_matricula(){
		System.out.println(matricula);
	}
	public void matricular_disciplina(Disciplina disciplina){
		disciplinas[pointer_disciplinas] = disciplina;
		pointer_disciplinas+=1;
	}
	public void listar_disciplinas(){
		for (int i= 0 ; i<pointer_disciplinas; i++) {
			System.out.println("["+i+"]"+disciplinas[i].get_nome());

		}
	}
	public void selecionar_disciplina(){
		System.out.println("Escolha a disciplina: ");
		int i;
		for (i=0; i<pointer_disciplinas; i++) {
			System.out.println("["+i+"]"+disciplinas[i].get_nome());

		}
		int b = myObj.nextInt();

		disciplinas[b].listar_notas();

	}
}