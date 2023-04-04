package cinema;

public class Filme {
	private String titulo, genero, sinopse, link;
	private int duracao, classIndic;
	
	/**
	 * Construtor da classe Filmes com:
	 * @param titulo
	 * @param genero
	 * @param sinopse
	 * @param link
	 * @param duracao
	 * @param classIndic
	 */
	public Filme(String titulo, String genero, String sinopse, String link, int duracao, int classIndic) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.sinopse = sinopse;
		this.link = link;
		this.duracao = duracao;
		this.classIndic = classIndic;
	}
	
	public void status() {
		System.out.println("Titulo: " + this.getTitulo() + "\nGenero: " + this.getGenero() + "\nSinopse: " + this.getSinopse() +
				"\nLink: " + this.getLink() + "\nDuracao: " + this.getDuracao() + "min \nClassificacao Indicativa: " + this.getClassIndic());
		System.out.println("--------------------------------------------------------------");
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public int getClassIndic() {
		return classIndic;
	}
	public void setClassIndic(int classIndic) {
		this.classIndic = classIndic;
	}	
}

