package org.testesOne;

import java.util.ArrayList;

public class Biblioteca {

	
	public String nome;
	public ArrayList <Livro> livros;
	public ArrayList <Pessoa> pessoa;
	
	
	public Biblioteca(String nome) {
		this.nome = nome;
		
		livros = new ArrayList<Livro>();
		pessoa = new ArrayList<Pessoa>();
		
	}


	public String getNome() {
		return nome;
	}


	public ArrayList<Livro> getLivros() {
		return livros;
	}


	public ArrayList<Pessoa> getPessoa() {
		return pessoa;
	}


	public void addLivro(Livro l) {
		this.getLivros().add(l);
		
	}


	public void removeLivros(Livro l1) {
		this.livros.remove(l1);
		
	}
	
	public void addPessoa(Pessoa p1) {
		this.getPessoa().add(p1);
	}

	public void removePessoa(Pessoa p1) {
		this.pessoa.remove(p1);
	}


	public boolean emprestimo(Livro l1, Pessoa p1) {
		int livrosEmprestados = this.getLivrosPorPessoa(p1).size();
		if((l1.getPessoa() == null) && (livrosEmprestados < p1.getMaxLivros())){
			l1.setPessoa(p1);
			return true;
		}else {
			return false;
		}
	}

	public boolean devolucao(Livro l1) {
		if(l1.getPessoa() != null) {
			l1.setPessoa(null);
			return true;
		}else {
			return false;
		}
	}


	public ArrayList<Livro> getLivrosPorPessoa(Pessoa p1) {
		ArrayList<Livro> resultado = new ArrayList<Livro>();
		
		for(Livro l : getLivros()) {
			if(l != null){
				if(l.getPessoa().getNome().equals(p1.getNome())) {
					resultado.add(l);
				}
			}
				
		}
		return resultado;

	}

}
