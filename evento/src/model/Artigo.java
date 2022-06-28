package model;

public final class Artigo extends Submissao {
	private String resumo;
	private static int numeroArtigos;
	
	public Artigo() {
		
		super();
		this.implementarNumeroArtigo();
		
	}

	public Artigo(String titulo, int situacao, Autor autor, Area area, String resumo) {
		super(titulo, situacao, autor, area);
		this.resumo = resumo;
		this.implementarNumeroArtigo();
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
private static void implementarNumeroArtigo() {
	numeroArtigos++;
}

}
