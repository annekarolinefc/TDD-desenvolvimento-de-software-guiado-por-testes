import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestePilha {

	@Before
	public void setUp() throws Exception {
	}

	//COME�A PELO MAIS SIMPLES 
	//1�) CONSIDERANDO A PILHA VAZIA
	@Test
	public void pilhaVazia() {
		Pilha p = new Pilha();
		assertTrue(p.estaVazia());
		assertEquals(0, p.tamanho());
	}
	
	//2�) EMPILHA UM ELEMENTO
	@Test
	public void empilhaUm() {
		Pilha p = new Pilha();
		p.empilha("primeiro");
		assertFalse(p.estaVazia());
		assertEquals(1, p.tamanho());
		assertEquals("primeiro", p.topo());
	}

}
