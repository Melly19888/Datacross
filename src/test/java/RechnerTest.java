import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RechnerTest {
	
	@Test
	public void testeUmsatzJahr() {
		Rechner rechner = new Rechner();
		rechner.berechne(500, 100, 2, 1, 1, 0.5, 0.25, 0.25);
		assertEquals(8400.0, rechner.getUmsatzJahr(), 0.01);
	}

	@Test
	public void testeUmsatzMonat() {
		Rechner rechner = new Rechner();
		rechner.berechne(500, 100, 2, 1, 1, 0.5, 0.25, 0.25);
		assertEquals(700.0, rechner.getUmsatzMonat(), 0.01);
	}

	@Test
	public void testeUmsatzWoche() {
		Rechner rechner = new Rechner();
		rechner.berechne(500, 100, 2, 1, 1, 0.5, 0.25, 0.25);
		assertEquals(161.54, rechner.getUmsatzWoche(), 0.01);
	}

	@Test
	public void testeUmsatzTag() {
		Rechner rechner = new Rechner();
		rechner.berechne(500, 100, 2, 1, 1, 0.5, 0.25, 0.25);
		assertEquals(23.01, rechner.getUmsatzTag(), 0.01);
	}

}
