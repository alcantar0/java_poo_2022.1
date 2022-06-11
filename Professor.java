class Professor{

	private Disciplina[] disciplinas = new Disciplina[10];
	private int pointer_disciplinas=0;


	public Professor(int cpf, String nome, float salario){
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}

	public void get_disciplinas(){
		System.out.println("ola");
		for(int i=0; i<pointer_disciplinas-1;i++){
			System.out.println(disciplinas[i].get_nome());
		}
	}

	public void set_disciplinas(String nome_disciplina, Professor professor){
		disciplinas[pointer_disciplinas] = new Disciplina(nome_disciplina, professor);
		pointer_disciplinas+=1;
	}



}