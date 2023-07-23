import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WarengruppeTest {

	@Test
	public void testUmsatzJahr() {
		Warengruppe wg = new Warengruppe();
		wg.berechne(400, 0.5, 2);
		assertEquals (3600.0, wg.getUmsatzJahr(), 0.00001);
	}

	@Test
	public void testUmsatzMonat() {
		Warengruppe wg = new Warengruppe();
		wg.berechne(400, 0.5, 2);
		assertEquals (300.0, wg.getUmsatzMonat(), 0.00001);
	}

	@Test
	public void testUmsatzTag() {
		Warengruppe wg = new Warengruppe();
		wg.berechne(400, 0.5, 2);
		assertEquals (9.86, wg.getUmsatzTag(), 0.01);
	}

	@Test
	public void testUmsatzWoche() {
		Warengruppe wg = new Warengruppe();
		wg.berechne(400, 0.5, 2);
		assertEquals (69.23, wg.getUmsatzWoche(), 0.01);
	}

}
