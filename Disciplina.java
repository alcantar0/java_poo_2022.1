class Disciplina{
	public String nome;
	private Professor professor;
	double av1, av2, media;

	public Disciplina(String nome, Professor professor){
		this.nome=nome;
		this.professor=professor;
	}

	public String get_nome(){
		return nome;
	}

	public Professor get_professor(){
		System.out.println(professor.get_nome());

		return professor;
	}
	public void set_professor(Professor professor){
		this.professor = professor;
	}
	public void listar_notas(){
		System.out.printf("AV1: %f", av1);
		System.out.printf("AV2: %f", av2);

	}

}