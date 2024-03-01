package unidad3.tarea5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	private Cuenta c1;

	@BeforeEach
	void setUp() throws Exception {
		c1 = new Cuenta("1", "Antonio");
	}

	@Test
	void testIngresar() throws Exception {
		c1.ingresar(35.0);
		assertEquals(35.0, c1.getSaldo());
	}

	@Test
	void testIngresarCantidadNegativa() throws Exception {
		try {
			c1.ingresar(-35.0);
		} catch (Exception e) {
			assertEquals("No se puede ingresar una cantidad negativa", e.getMessage());
			throw e;
		}
	}

	@Test
	void testRetirar() throws Exception {
		c1.ingresar(125.0);
		c1.retirar(35.0);
		assertEquals(90.0, c1.getSaldo());
	}

	@Test
	void testRetirarCantidadNegativa() throws Exception {
		try {
			c1.retirar(-200.0);
		} catch (Exception e) {
			assertEquals("No se puede retirar una cantidad negativa", e.getMessage());
			throw e;
		}
	}

	@Test
	void testRetirarSaldoInsuficiente() throws Exception {
		try {
			c1.retirar(35.0);
		} catch (Exception e) {
			assertEquals("Saldo insuficiente", e.getMessage());
			throw e;
		}
	}

	@Test
	void testIngresarConConcepto() throws Exception {
		c1.ingresar("Venta", 450.0);
		assertEquals(450.0, c1.getSaldo());
	}

	@Test
	void testRetirarConConcepto() throws Exception {
		c1.ingresar(105.0);
		c1.retirar("Compra", 50.0);
		assertEquals(55.0, c1.getSaldo());
	}

}
