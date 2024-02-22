package unidad3.tarea4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SubscripcionTest {

	private Subscripcion s1,s2,s3;
    private OperadorAritmetico o;
    
    private final int precio1 = 30;
    private final int periodo1 = 2;
    
    private final int precio2 = 11;
    private final int periodo2 = 5;
    
    private final int precio3 = -1;
    private final int periodo3 = 0;
    
   @BeforeEach
   public void SubscripcionTest() {
	   s1 = new Subscripcion(precio1,periodo1);
	   s2 = new Subscripcion(precio2,periodo2);
	   s3 = new Subscripcion(precio3,periodo3);
	   o = new OperadorAritmetico();
   }
   
   @Test
   public void testPrecioPorMes() throws Exception{
	   assertEquals(s1.precioPorMes(),o.division(precio1, periodo1));
	   assertNotEquals(s2.precioPorMes(),o.division(precio2, periodo2));
	   assertNotEquals(s3.precioPorMes(),o.division(precio3, periodo3));
   }

   
   @Test
   public void testCancel(){
	   s1.cancel();
	   s2.cancel();
   }
   
   @Test
   public void testSuma() {
	   o.suma(precio1, precio2);
   }
}
