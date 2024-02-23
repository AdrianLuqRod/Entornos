package unidad3.tarea4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FridgeTest {

	Fridge fr1;
	String comida = "strawberry";
	
	@BeforeEach
	public void init() {
		fr1 = new Fridge();
		fr1.put(comida);
	}

	@Test
	void testAnadirMismoAlimento() {
		assertFalse(fr1.put(comida));
	}
	
	@Test
	void testBuscarAlimentoAusente() throws NoSuchItemException {
		fr1.take(comida);
		assertFalse(fr1.contains(comida));
	}
	
	@Test
    public void testSacarAlimentoAusente() throws NoSuchItemException {
		fr1.take(comida);
        assertThrows(NoSuchItemException.class, () -> fr1.take(comida));
    }
	
	@ParameterizedTest()
	@ValueSource(strings = {"fresas", "queso", "zumo"})
	void testMeterAlimentos(String alimento) {
		assertTrue(fr1.put(alimento));
	}
}
