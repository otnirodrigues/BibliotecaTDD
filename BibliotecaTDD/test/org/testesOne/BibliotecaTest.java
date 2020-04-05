package org.testesOne;

import java.util.ArrayList;

import junit.framework.TestCase;

public class BibliotecaTest extends TestCase {
	
	private Livro l1;
	private Livro l2;
	private Pessoa p1;
	private Pessoa p2;
	private Biblioteca b1;

	public void testBiblioteca() {
		Biblioteca b1 = new Biblioteca("Biblioteca UFPB");
		
		assertEquals("Biblioteca UFPB", b1.nome);
		
		assertTrue(b1.livros instanceof ArrayList);
		assertTrue(b1.pessoa instanceof ArrayList);
		
	
	}
	
	public void setup() {
		
		Livro l1 = new Livro("Livro 1");
		Livro l2 = new Livro("Livro 2");
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Otni");
		p2.setNome("Renallyda");
		
		b1 = new Biblioteca("Test");
	
	}
	
	public void testAddLivro() {
		// criar objetos
		
		setup();
		
		// testar se a biblioteca está vazia
		
		assertEquals(0, b1.getLivros().size());
		
		// adicionar os livros criados na biblioteca
		
		b1.addLivro(l1);
		b1.addLivro(l2);
		
		// Erro, está adicionando os dois livros na mesma posição do array. PQ??
		

		assertEquals(2, b1.getLivros().size());
		assertEquals(0, b1.getLivros().indexOf(l1));
		assertEquals(0, b1.getLivros().indexOf(l2));
			
		// Remove livros biblioteca
		
		b1.removeLivros(l1);
		
		assertEquals(1, b1.getLivros().size());
		assertEquals(0, b1.getLivros().indexOf(l2));
		
		b1.removeLivros(l2);
		assertEquals(0, b1.getLivros().size());
	}
	
	public void testEmprestimo() {
		// adiconar os objetos
		
		Livro l1 = new Livro("Livro 1");
		Livro l2 = new Livro("Livro 2");
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Otni");
		p2.setNome("Renallyda");
		
		b1 = new Biblioteca("Test");
		
		addItens();
		
		
		assertTrue("Livro não pode ser emprestado", b1.emprestimo(l1, p1));
		
		assertEquals("Otni", l1.getPessoa().getNome());
		
		assertFalse("Livro já foi emprestado", b1.emprestimo(l1, p2));
		
		assertTrue("Devolução de livro falhou", b1.devolucao(l1));
		
		assertFalse("Já foi feita a devolução", b1.devolucao(l1));
	
		assertFalse("Livro nunca foi emprestado", b1.devolucao(l1));
	
		// test adicional para maximo livros
		
		setup();
		
		p1.setMaxLivros(1);
		addItens();
		
		
		assertTrue("Primeiro livro não pode ser emprestado", b1.emprestimo(l2, p1));
		
		assertFalse("Segundo Livro não pode ser emprestado", b1.emprestimo(l1, p1));
	
		
	}
	
	public void testGetLivrosPessoa() {
		
		Livro l1 = new Livro("Livro 1");
		Livro l2 = new Livro("Livro 2");
		
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.setNome("Otni");
		p2.setNome("Renallyda");
		
		b1 = new Biblioteca("Test");
		
		addItens();
		
		

		b1.emprestimo(l1, p1);
		
		ArrayList<Livro> testeLivros = b1.getLivrosPorPessoa(p1);
		
		assertEquals(1, testeLivros.size());
		assertEquals(0, testeLivros.indexOf(l1));
		
		b1.emprestimo(l2, p1);
		
		testeLivros = b1.getLivrosPorPessoa(p1);
		assertEquals(2, testeLivros.size());
		assertEquals(1, testeLivros.indexOf(l2));
		
		
	}

	private void addItens() {
		// refatoração de codigos para adicionar itens
		// evita duplicação de codigo
		
		b1.addLivro(l1);
		b1.addLivro(l2);
		b1.addPessoa(p1);
		b1.addPessoa(p2);
	}
	
	
	
}
