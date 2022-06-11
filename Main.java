class Main{
	public static void main(String[] args) {
		Professor pit = new Professor(145, "Pitagoras", 4000);

		Disciplina dis = new Disciplina("POO", pit);

		System.out.println(dis.get_professor());

	}
}