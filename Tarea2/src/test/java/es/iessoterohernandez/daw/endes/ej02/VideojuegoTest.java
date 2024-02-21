package es.iessoterohernandez.daw.endes.ej02;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class VideojuegoTest {
	private Videojuego v;
	private Videojuego v2;
	private Videojuego v3;
	private Videojuego v4;

	@BeforeEach
	public void iniciar() {
		v = new Videojuego();
		v2 = new Videojuego();
		v3 = new Videojuego("Dedad Space", 25, "Miedo", "Algo2");
		v4 = new Videojuego("Among Us", 2, "Terror", "Algo1");
	}

	@AfterEach
	public void finalizar() {
		v = null;
		v2 = null;
		v3 = null;
		v4 = null;
	}

	@Test
	public void igualar() {
		assertTrue(v.equals(v2));
		assertFalse(v.equals(v4));
	}

	@Test
	public void comparar() {
		assertEquals(Videojuego.MAYOR, v.compareTo(v3));
		assertEquals(Videojuego.IGUAL, v.compareTo(v2));
		assertEquals(Videojuego.MENOR, v4.compareTo(v3));
	}

	@Test
	public void entregar() {
		v.entregar();
		assertTrue(v.isEntregado());

		v.devolver();
		assertFalse(v.isEntregado());
	}

	@Test
	public void testToString() {
		assertEquals("Informacion del videojuego: \n" + "\tTitulo: TWD\n" + "\tHoras estimadas: 20\n"
				+ "\tGenero: Terror\n" + "\tcompania: Flux Games", v3.toString());
	}

}
