package org.testesOne;

public class Livro {

	String titulo;
	String autor;
	Pessoa pessoa;

	public Livro(String string) {
		this.titulo = string;
		this.autor = "Autor Desconhecido";
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPessoa(Pessoa p1) {
		this.pessoa = p1;
	}

	public Pessoa getPessoa() {
		return this.pessoa;
	}

}
