import java.util.Scanner;

class Professor{
	Scanner myObj2 = new Scanner(System.in);
	Scanner myObj = new Scanner(System.in);
	private int cpf;
	private String nome;
	private float salario;
	private String senha;

	private Disciplina[] disciplinas = new Disciplina[10];
	private int pointer_disciplinas=0;


	public Professor(){
		System.out.println("Digite o CPF: ");
		this.cpf = myObj.nextInt();
		System.out.println("Digite nome ");
		this.nome = myObj2.nextLine();
		System.out.println("Digite sua nova senha: ");
		this.senha = myObj2.nextLine();
	}

	public void get_disciplinas(){
		System.out.println("ola");
		for(int i=0; i<pointer_disciplinas-1;i++){
			System.out.println(disciplinas[i].get_nome());
		}
	}
	public String get_nome(){
		return nome;
	}

	public void set_disciplinas(String nome_disciplina, Professor professor){
		disciplinas[pointer_disciplinas] = new Disciplina(nome_disciplina, professor);
		pointer_disciplinas+=1;
	}
	public boolean comparar_senhas(String tentativa){
		if (senha.equals(tentativa)) {
			return true;
		}
		else{
			return false;
		}
	}
	public void cadastrar_notas(Estudante estudante){
		for (int i=0; i<pointer_disciplinas; i++) {
			System.out.println(disciplinas[i]);

		}
	}



}