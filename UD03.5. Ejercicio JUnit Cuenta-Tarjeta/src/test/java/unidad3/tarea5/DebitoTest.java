package unidad3.tarea5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DebitoTest {

	private Debito debito;
	private Cuenta cuentaAsociada;

	@BeforeEach
	void setUp() {
		cuentaAsociada = new Cuenta("1234", "Pepe");
		debito = new Debito("5678", "PepeTarjeta", new Date());
		debito.setCuenta(cuentaAsociada);
	}

	@AfterEach
	void tearDown() {
		cuentaAsociada = null;
		debito = null;
	}

	@Test
	void testRetirar() throws Exception {
		cuentaAsociada.ingresar(500.0);
		debito.retirar(200.0);
		assertEquals(300.0, cuentaAsociada.getSaldo(), 0.01);
	}

	@Test
	void testPagoEnEstablecimiento() throws Exception {
		cuentaAsociada.ingresar(300.0);
		debito.pagoEnEstablecimiento("Restaurante", 150.0);
		assertEquals(150.0, cuentaAsociada.getSaldo());
	}

	@Test
	void testGetSaldo() throws Exception {
		cuentaAsociada.ingresar(100.0);
		assertEquals(100.0, debito.getSaldo());
	}

	

}
