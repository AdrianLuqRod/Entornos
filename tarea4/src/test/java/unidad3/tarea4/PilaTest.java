package unidad3.tarea4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilaTest {

	private Pila p;

	@BeforeEach
	public void pila() {
		p = new Pila();
	}

	@Test
	public void pushTest() {
		p.push(1);
		p.push(3);
	}
	
	
	@Test
	public void popTest() {
		assertEquals(p.pop(),null);	
		
		p.push(3);
		int n = p.pop();
		
		assertEquals(n,3);
		
	}
	
	
	@Test
	public void isEmptyTest(){
		assertEquals(p.isEmpty(),true);
	}
	
	
	@Test
	public void topTest() {
		assertEquals(p.top(),null);	
		
		p.push(3);
		int n = p.top();
		
		assertEquals(n,3);
		
	}
}
