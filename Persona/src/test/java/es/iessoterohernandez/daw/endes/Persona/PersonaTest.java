package es.iessoterohernandez.daw.endes.Persona;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class PersonaTest {

	private Persona persona;

	@BeforeEach
	void iniciar() {
		persona = new Persona("Adri", 19, 'H', 78, 1.76);
	}

	@AfterEach
	void finalizar() {
		persona = null;
	}

	@Test
	void testPersonaCreada() {
		assertThat(persona, notNullValue());
	}

	@Test
	void testEdad() {
		assertDoesNotThrow(() -> persona.setEdad(19));
	}

	@Test
	void testMayorEdad() {
		assertTrue(persona.esMayorDeEdad());
	}

	@Test
	void testMenorEdad() {
		persona.setEdad(13);
		assertFalse(persona.esMayorDeEdad());
	}

	@Test
	void testPesoIdeal() {
		assertThat(persona.calcularIMC(), is(Persona.PESO_IDEAL));
	}

}