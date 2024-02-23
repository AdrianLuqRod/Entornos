package unidad3.tarea4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class AccountTest2 {

	Account ac1;

	@BeforeEach

	void init() {

		ac1 = new Account("Juanma", 123456789020L, 750F);

	}

	@AfterEach

	void finish() {

		ac1 = null;

	}

	@Test

	public void testDecimalFailure() {

		float balance = ac1.getBalance();

		for (int i = 0; i < 100; i++) {

			balance += 0.23F;

		}

		assertNotEquals(balance, 773F);

		assertEquals(balance, 772.99805F);

	}

}
