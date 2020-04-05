package org.testesOne;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(LivroTest.class);
		suite.addTestSuite(PessoaTest.class);
		suite.addTestSuite(BibliotecaTest.class);
		//$JUnit-END$
		return suite;
	}

}
