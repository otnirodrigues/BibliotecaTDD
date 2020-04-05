package org.testesOne;

public class Pessoa {

	//Atributos
	
	private String nome; // nome da pessoa
	private int maxLivros; //num de livros maximos
	
	// Construtor
	public Pessoa () {
		nome = "Nome Desconhecido";
		maxLivros = 3;
	}
	
	// Metodos
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}

	public int getMaxLivros() {
		return maxLivros;
	}

	public void setMaxLivros(int maxLivros) {
		this.maxLivros = maxLivros;
	}
	
	
	public String toString() {
		return this.nome + " tem " + this.maxLivros + " livros";
	}
}
