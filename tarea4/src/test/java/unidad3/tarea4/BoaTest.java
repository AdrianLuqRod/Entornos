package unidad3.tarea4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

class BoaTest {

	private Boa b1,b2,b3,b4;

	@BeforeEach
	public void BoaTest() {
		b1 = new Boa("donut", 4, "granola bars");
		b2 = new Boa("donut", 34, "granola bars");
		b3 = new Boa("cheese", 2, "granola bars");
		b4 = new Boa("burguer", 41, "granola bars");
	}

	

	@Test
	public void testBoaNoCabeEnJaula() {
		assertFalse(b1.fitsInCage(1));
	}

	@Test
	void testBoaCabeEnJaula() {
		assertTrue(b1.fitsInCage(20));
	}

	@Test()
	void testBoaSana() {
		assertEquals(b1.isHealthy(), true);
		assertEquals(b2.isHealthy(), true);
		assertEquals(b3.isHealthy(), true);
		assertEquals(b4.isHealthy(), true);
	}
}
