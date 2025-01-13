import tp_medev.*;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PionTest {
	@Test
	public void getCouleur() {
		Pion p = new Pion(true, 123, 123);
		boolean expected = true;
		boolean actual = p.getCouleur();

		assertEquals(expected, actual);
	}

	@Test
	public void setCouleur() {
		Pion p = new Pion(true, 123, 123);
		boolean couleur = true;
		p.setCouleur(couleur);
	}

	@Test
	public void getX() {
		Pion p = new Pion(true, 123, 123);
		int expected = 123;
		int actual = p.getX();

		assertEquals(expected, actual);
	}

	@Test
	public void setX() {
		Pion p = new Pion(true, 123, 123);
		int x = 123;
		p.setX(x);
	}

	@Test
	public void getY() {
		Pion p = new Pion(true, 123, 123);
		int expected = 123;
		int actual = p.getY();

		assertEquals(expected, actual);
	}

	@Test
	public void setY() {
		Pion p = new Pion(true, 123, 123);
		int y = 123;
		p.setY(y);
	}

}
