class Estudante extends Instituicao{
	private int matricula, idade;
	private String nome;



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


}