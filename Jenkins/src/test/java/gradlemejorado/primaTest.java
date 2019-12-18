package gradlemejorado;

import static org.junit.Assert.*;

import org.junit.Test;

public class primaTest {
	
	prima p = new prima();

	//Debe funcionar
	@Test
	public void testCalcularPrima1() {
		assertEquals(p.calcularPrima(28,12),900,0);
	}

	//Debe fallar
	@Test
	public void testCalcularPrima2() {
		assertEquals(p.calcularPrima(28,12),500,0);
	}
	
	//Debe fallar
		@Test
		public void testCalcularPrima3() {
			assertEquals(p.calcularPrima(50,2),500,0);
	}
		
	//Debe fallar
		@Test
		public void testCalcularPrima4() {
			assertEquals(p.calcularPrima(51,3),500,0);
	}
		
	//Debe funcionar
		 @Test
		 public void testCalcularPrima5() {
			assertEquals(p.calcularPrima(41,8),500,0);
	}
		 
	//Debe funcionar
		@Test
		public void testCalcularPrima6() {
		   assertEquals(p.calcularPrima(42,8),500,0);
	}
		
	//Debe fallar
		@Test
		public void testCalcularPrima7() {
		  assertEquals(p.calcularPrima(46,8),500,0);
	}

}
