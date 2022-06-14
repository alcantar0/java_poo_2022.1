class Instituicao{
	private int matricula_geral=0;

	protected int gerar_matricula(){
		return matricula_geral+=1;
	}
	public double calcular_media(double av1, double av2){
		return (double)(av1+av2)/2;
	}




}