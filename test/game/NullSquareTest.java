/**
 * 
 */
package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 *
 * 
 */
class NullSquareTest {

	NullSquare nullSquare;
	String name;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		name = "SquareName";
	}

	/**
	 * Test NullSquare default constructor
	 */
	@Test
	void testNullSquareDefaultConstructor() {
		nullSquare = new NullSquare();
		assertNotNull(nullSquare);
	}

	/**
	 * Test method for nullsquare constructor with arguments
	 */
	@Test
	void testNullSquareConstructorWithArgument() {
		nullSquare = new NullSquare(name);
		assertNotNull(nullSquare);
	}

	/**
	 * Test method for nullsquare name setter and getter
	 */
	@Test
	void testGetSetSquareName() {
		nullSquare = new NullSquare();
		nullSquare.setSquareName(name);
		assertEquals(nullSquare.getSquareName(), name);
	}

}
