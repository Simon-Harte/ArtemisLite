package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 */
class DevelopmentSystemTest {

	DevelopmentSystem devSys;
	
	Systems name;
	
	int squareIndex1, squareindex2;
	
	boolean owned;
	 
	@BeforeEach
	void setUp() throws Exception {
		
		name = Systems.SUITS;
		
		squareIndex1 = 5;
		squareindex2 = 6;
		
		owned = true;
	}

	/**
	 * Test default DevelopmentSystem constructor
	 */
	@Test
	void testDevelopmentSystem() {
		devSys = new DevelopmentSystem();
		assertNotNull(devSys);
	}

	/**
	 * Test DevelopmentSystem constructor with argument
	 */
	@Test
	void testDevelopmentSystemConstructorWithArgument() {
		devSys = new DevelopmentSystem(name);
		assertNotNull(devSys);
	}

	@Test
	void testGetSetSystemName() {
		devSys = new DevelopmentSystem();
		devSys.setSystemName(name);
		assertEquals(name, devSys.getSystemName());
	}

	/**
	 * Test isOwned setter and getter
	 */
	@Test
	void testSetIsOwned() {
		devSys = new DevelopmentSystem();
		devSys.setOwned(owned);
		assertEquals(owned, devSys.isOwned());
	}

	/**
	 * Test the adding to squares and retrieving squares methods
	 */
	@Test
	void testGetSquaresAndAddSquareToSystem() {
		devSys = new DevelopmentSystem();
		devSys.addSquareToSystem(squareIndex1);
		devSys.addSquareToSystem(squareindex2);
		assertTrue(devSys.getSquaresInSystem().contains(Integer.valueOf(squareIndex1))
				&& devSys.getSquaresInSystem().contains(Integer.valueOf(squareindex2)));
	}

}
