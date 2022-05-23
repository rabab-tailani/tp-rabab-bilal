package ma.mini_projet_hotel;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ChambreTest {

	Chambre ch;
	
	@Before
	public void setUp() throws Exception {
		ch = new Chambre();
	}

	@After
	public void tearDown() throws Exception {
		ch = null;
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testNbrChombreReserver() {
		int[] chm = {1, 1, 1, 0};
		assertEquals(3, ch.nbrChombreReserver(chm));
	}
	
	@Test
	public void testNbrChombreLibre() {
		int[] chm = {1, 1, 0, 0};
		assertEquals(2, ch.nbrChombreLibre(chm));
	}
	
	@Test
	public void testPreChambreLibre() {
		int[] chm = {1, 0, 0, 1};
		assertEquals(1, ch.preChambreLibre(chm));
	}
	
	@Test
	public void testDerChambreLibre() {
		int[] chm = {1, 0, 0, 1};
		System.out.println( ch.derChambreLibre(chm));
		assertEquals(2, ch.derChambreLibre(chm));
	}
	
	@Test
	public void testResChambre() {
		int[] chm = {1, 0, 0, 1};
		
		ch.resChambre(chm, 1);
		int chmRes = ch.nbrChombreReserver(chm);
		
		assertEquals(3, chmRes);
	}
	
	@Test
	public void testLibChambre() {
		int[] chm = {1, 0, 0, 1};
		
		ch.libChambre(chm, 0);
		int chmLib = ch.nbrChombreLibre(chm);
		
		assertEquals(3, chmLib);
	}

}
