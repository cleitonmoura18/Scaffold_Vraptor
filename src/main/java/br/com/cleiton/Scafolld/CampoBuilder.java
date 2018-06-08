package br.com.cleiton.Scafolld;

public class CampoBuilder {
	public static Campo create(String nome, String titulo, TipoCampoEnum tipo, Boolean pesquisa) {
		Campo campo = new Campo(nome, titulo, tipo);
		campo.setPesquisa(pesquisa);
		return campo;
	}

	public static Campo create(String nome, String titulo, TipoCampoEnum tipo) {
		return create(nome, titulo, tipo, false);
	}

	public static Campo create(String nome, String titulo) {
		return create(nome, titulo, TipoCampoEnum.TEXTO, false);
	}
}
