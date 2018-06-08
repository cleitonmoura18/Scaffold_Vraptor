package br.com.cleiton.Scafolld;

import java.util.ArrayList;
import java.util.List;

public class TemplateScaffold {
	private String titulo;
	
	private List<Campo> campos;

	public TemplateScaffold() {
		super();
		this.campos = new ArrayList<Campo>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Campo> getCampos() {
		return campos;
	}

	public void setCampos(List<Campo> campos) {
		this.campos = campos;
	}

	public TemplateScaffold add(Campo arg0) {
		 campos.add(arg0);
		 return this;
	}
	
	
}
