package tp_medev;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class PlateauTest {
	@Test
	public void Plateau() {
		Plateau p = new Plateau();
		Pion pion = p.getCase(3,3);
		assertEquals(pion.getCouleur(), Pion.BLANC);
	}

	@Test
	public void getPlateau() {
		Plateau p = new Plateau();
		Pion[][] expected = null;
		Pion[][] actual = p.getPlateau();

		assertArrayEquals(expected, actual);
	}

	@Test
	public void setPlateau() {
		Plateau p = new Plateau();
		Pion[][] plateau = new Pion[8][8];
		p.setPlateau(plateau);

		assertArrayEquals(p.getPlateau(), plateau);
	}

	@Test
	public void getCase() {
		Plateau p = new Plateau();
		int x = 123;
		int y = 123;
		Pion expected = new Pion(true, 123, 123);
		Pion actual = p.getCase(x, y);

		assertEquals(expected, actual);
	}

	@Test
	public void setCase() {
		Plateau p = new Plateau();
		Pion pion = new Pion(true, 123, 123);
		p.setCase(pion);
	}

	@Test
	public void setCaseTODO() {
		Plateau p = new Plateau();
		boolean couleur = true;
		int x = 123;
		int y = 123;
		p.setCase(couleur, x, y);
	}

	@Test
	public void affiche() {
		Plateau p = new Plateau();
		p.affiche();
	}

	@Test
	public void casesDispo() {
		Plateau p = new Plateau();
		Joueur player = new Joueur("abc");
		ArrayList<int[]> expected = null;
		ArrayList<int[]> actual = p.casesDispo(player);

		assertEquals(expected, actual);
	}
}
