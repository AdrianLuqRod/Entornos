package unidad3.tarea4;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.isA;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class AccountTest {

	Account ac1;
	float balanceInicial,tarifa;
	
	@BeforeEach
	void init() {
		ac1 = new Account("Juan", 112233445566L, 600F);
		balanceInicial = ac1.getBalance();
		tarifa = 2F;
	}
	
	@Test
	void testCuentaCreada() {
		assertThat(ac1, notNullValue());
	}
	
	@Test
	void testAnadirInteres() {
		ac1.addInterest();
		assertNotEquals(ac1.getBalance(), balanceInicial);
	}
	
	@Test
	void testNumeroCuentaLong() {
		assertThat(ac1.getAccountNumber(), isA(long.class));
	}
	
	@Test
    void testToString() {
		String resultado = ac1.toString();
		assertTrue(resultado.contains(Long.toString(ac1.getAccountNumber())));
	    assertTrue(resultado.contains(String.format("%.2f", balanceInicial)));
    }
	
}
