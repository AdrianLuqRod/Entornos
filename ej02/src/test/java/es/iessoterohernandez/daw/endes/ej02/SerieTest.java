package es.iessoterohernandez.daw.endes.ej02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class SerieTest {
	private Serie serie;
	private Serie serie2;
	private Serie serie3;
	private Serie serie4;

	@BeforeEach
	public void iniciar() {
		serie = new Serie("You", 6, "Suspense", "Paco");
		serie2 = new Serie("American Dad", 3, "Comedia", "Paco");
		serie3 = new Serie();
		serie4 = new Serie();
	}

	@AfterEach
	public void finalizar() {
		serie = null;
		serie2 = null;
		serie3 = null;
		serie4 = null;
	}

	@Test
	public void igualar() {
		assertTrue(serie3.equals(serie4));
		assertFalse(serie.equals(serie3));
		assertFalse(serie.equals(serie2));
	}

	@Test
	public void compararTemporadas() {
		assertEquals(Serie.MAYOR, serie.compareTo(serie2));
		assertEquals(Serie.IGUAL, serie2.compareTo(serie3));
		assertEquals(Serie.MENOR, serie2.compareTo(serie));
	}

	@Test
	public void entregar() {
		serie.entregar();
		assertTrue(serie.isEntregado());

	}

	@Test
	public void devolver() {
		serie.devolver();
		assertFalse(serie.isEntregado());
	}

	@Test
	public void testToString() {
		assertEquals("Informacion de la Serie: \n" + "\tTitulo: You\n" + "\tNumero de temporadas: 6\n"
				+ "\tGenero: Suspense\n" + "\tCreador: Paco", serie.toString());
	}

}
