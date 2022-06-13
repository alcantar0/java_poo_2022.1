class Main{
	public static void main(String[] args) {
		Professor pit = new Professor(145, "Pitagoras", 4000);

		Disciplina poo = new Disciplina("POO", pit);

		Disciplina lp = new Disciplina("Linguagens de programação", pit);

		Estudante pedro = new Estudante(19, "Pedro Henrique");

		pedro.matricular_disciplina(poo);

		Disciplina p = pedro.selecionar_disciplina();
		System.out.println("aqui "+p.get_nome());

		//pedro.listar_notas();

		System.out.println(poo.get_professor());

	}
}