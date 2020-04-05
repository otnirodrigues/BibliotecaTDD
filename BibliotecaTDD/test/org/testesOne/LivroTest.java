package org.testesOne;

import junit.framework.TestCase;

public class LivroTest extends TestCase {
	
	public void testLivro() {
		Livro l = new Livro("Grandes Expectativas");
		assertEquals("Grandes Expectativas", l.titulo);
		assertEquals("Autor Desconhecido", l.autor);
	}

	public void testGetPessoa() {
		Livro l1 = new Livro("Guerra e Paz");
		Pessoa p1 = new Pessoa();
		p1.setNome("Renallyda");
	
	// Metodo para dizer que o livro está com a pessoa
		
		l1.setPessoa(p1);
		
		// Pegar o nome da pessoa que está com o livro
		
		String testNome = l1.getPessoa().getNome();	
		assertEquals("Renallyda", testNome);
	}
	
}
