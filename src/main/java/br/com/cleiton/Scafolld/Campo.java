package br.com.cleiton.Scafolld;

public class Campo {
	private String nome, titulo;
	private TipoCampoEnum tipo;
	private Boolean pesquisa;

	

	public Campo(String nome, String titulo, TipoCampoEnum tipo) {
		super();
		this.nome = nome;
		this.titulo = titulo;
		this.tipo = tipo;
	}

	public String getNome() {
		return "${"+nome+"}";
	}

	public String getTitulo() {
		return titulo;
	}

	public TipoCampoEnum getTipo() {
		return tipo;
	}

	public boolean getPesquisa() {
		return pesquisa;
	}

	public void setPesquisa(boolean pesquisa) {
		this.pesquisa = pesquisa;
	}
	
}
