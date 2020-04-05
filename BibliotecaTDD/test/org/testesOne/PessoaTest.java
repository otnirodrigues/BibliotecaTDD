package org.testesOne;


import junit.framework.TestCase;

public class PessoaTest extends TestCase {
	
	public void testPessoa() {
		Pessoa p = new Pessoa();
		assertEquals("Nome Desconhecido", p.getNome());
		assertEquals(3, p.getMaxLivros());
	}
	
	public void testSetNome() {
		Pessoa p1 = new Pessoa();
		p1.setNome("Otni");
		assertEquals("Otni", p1.getNome());
	}
	
	public void testSetMaxLivros() {
		Pessoa p2 = new Pessoa();
		p2.setMaxLivros(10);
		assertEquals(10, p2.getMaxLivros());
	}
	
	
	public void testToString() {
		Pessoa p3 = new Pessoa();
		p3.setNome("Otni Rodrigues");
		p3.setMaxLivros(7);
		String test = "Otni Rodrigues tem 7 livros";
		assertEquals(test, p3.toString());
	}
}
