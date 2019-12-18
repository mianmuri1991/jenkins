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

}
