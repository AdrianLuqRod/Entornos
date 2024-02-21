package Unidad3.tarea3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ShoppingCartTest {
	private ShoppingCart sc1;
	private Product p1, p2;

	@BeforeEach
	public void shoppingCartAndProducts() {

		sc1 = new ShoppingCart();

		p1 = new Product("Lampara", 5);
		p2 = new Product("Mando", 3);
	}

	@Test
	public void compruebaCero() {

		assertEquals(0, sc1.getItemCount());
	}

	@Test
	public void vacio() throws ProductNotFoundException {

		sc1.addItem(p1);
		sc1.empty();

		assertEquals(0, sc1.getItemCount());
	}

	@Test
	public void aumenta() {

		int i = sc1.getItemCount() + 1;
		sc1.addItem(p1);

		assertEquals(i, sc1.getItemCount());
	}

	@Test
	public void sumaBalances() {

		double a = sc1.getBalance() + p2.getPrice();
		sc1.addItem(p2);

		assertEquals(a, sc1.getBalance());
	}

	@Test
	public void decrementar() throws ProductNotFoundException {

		sc1.addItem(p1);

		int a = sc1.getItemCount() - 1;
		sc1.removeItem(p1);

		assertEquals(a, sc1.getItemCount());
	}

	@Test
	public void quitaElemento() {

		try {
			sc1.removeItem(p2);
			fail("ProductNotFoundException");
		} catch (ProductNotFoundException e) {
		}

	}
}
