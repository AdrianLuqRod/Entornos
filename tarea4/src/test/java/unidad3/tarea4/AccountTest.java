package unidad3.tarea4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.AfterEach;

import org.junit.jupiter.api.Test;

class AccountTest {

	private Account ac1;

	@BeforeEach

	public void setUp() {

		ac1 = new Account("Juanma Mesa", 654321, 1000.0f);

	}

	@Test

	public void testDepositValidAmount() {

		assertTrue(ac1.deposit(500.0f));

		assertEquals(1500.0f, ac1.getBalance());

	}

	@Test

	public void testDepositNegativeAmount() {

		assertFalse(ac1.deposit(-400.0f));

		assertEquals(1000.0f, ac1.getBalance());

	}

	@Test

	public void testWithdraw() {

		assertTrue(ac1.withdraw(500.0f, 0.0f));

		assertEquals(500.0f, ac1.getBalance());

		assertFalse(ac1.withdraw(-500.0f, 0.0f));

		assertFalse(ac1.withdraw(1500.0f, 0.0f));

		assertFalse(ac1.withdraw(-500.0f, 20.0f));

	}

	@Test

	public void testAddInterest() {

		ac1.addInterest();

		assertEquals(1045.0f, ac1.getBalance(), 0.001);

	}

	@Test

	public void testConstructor() {

		assertEquals("Juanma Mesa", ac1.name);

		assertEquals(123456, ac1.getAccountNumber());

		assertEquals(1000.0f, ac1.getBalance());

	}

	@Test

	public void testWithdrawInvalidAmount() {

		assertFalse(ac1.withdraw(-500.0f, 20.0f));

		assertEquals(1000.0f, ac1.getBalance());

	}

	@Test

	public void testWithdrawExceedingBalanceWithFee() {

		assertFalse(ac1.withdraw(1500.0f, 20.0f));

		assertEquals(1000.0f, ac1.getBalance());

	}

	@Test

	public void testToString() {

		assertEquals("654321\tJuanma Mesa\t$1,000.00", ac1.toString());

	}

}
