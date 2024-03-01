package unidad3.tarea5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MovimientoTest {

	private Movimiento m;

	@BeforeEach
	void setUp() throws Exception {
		m = new Movimiento();
	}

	@Test
	void testGetImporte() {
		assertEquals(0.0, m.getImporte());
	}

	@Test
	void testGetConcepto() {
		assertNull(m.getConcepto());
	}

	@Test
	void testSetConcepto() {
		m.setConcepto("Vendido");
		assertEquals("Vendido", m.getConcepto());
	}

	@Test
	void testGetFecha() {
		assertNotNull(m.getFecha());
	}

	@Test
	void testSetFecha() {
		Date fecha = new Date();
		m.setFecha(fecha);
		assertEquals(fecha, m.getFecha());
	}

	@Test
	void testSetImporte() {
		m.setImporte(35.0);
		assertEquals(35.0, m.getImporte());
	}

}
