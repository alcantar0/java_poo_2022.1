import java.util.Scanner;
class Estudante extends Instituicao{
	private int matricula, idade;
	private String nome;

	private Disciplina[] disciplinas = new Disciplina[10];
	private int pointer_disciplinas=0;



	public Estudante(int idade, String nome){
		this.matricula = gerar_matricula();
		this.idade = idade;
		this.nome = nome;
	}

	public void get_nome(){
		System.out.println(nome);
	}
	public void get_matricula(){
		System.out.println(matricula);
	}
	private void increment_pointer(){
		pointer_disciplinas+=1;
	}
	public void matricular_disciplina(Disciplina disciplina){
		disciplinas[pointer_disciplinas] = disciplina;
		increment_pointer();

	}
	public void listar_disciplinas(){
		for (int i= 0 ; i<pointer_disciplinas; i++) {
			System.out.println("["+i+"]"+disciplinas[i].get_nome());

		}
	}
	public Disciplina selecionar_disciplina(){
		Scanner myObj = new Scanner(System.in);
		System.out.println("Escolha a disciplina: ");
		int i;
		for (i=0; i<pointer_disciplinas; i++) {
			System.out.println("["+i+"]"+disciplinas[i].get_nome());

		}
		int b = myObj.nextInt();

		return disciplinas[b];

	}
}