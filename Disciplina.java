class Disciplina{
	public String nome;
	private Professor professor;

	public Disciplina(String nome, Professor professor){
		this.nome=nome;
		this.professor=professor;
	}

	public String get_nome(){
		return nome;
	}

	public Professor get_professor(){
		System.out.println(professor.nome);

		return professor;
	}
	public void set_professor(Professor professor){
		this.professor = professor;
	}

}