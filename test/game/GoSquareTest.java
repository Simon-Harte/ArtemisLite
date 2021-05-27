package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 * 
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 *
 *
 */
class GoSquareTest {

	GoSquare goSquare;

	String name;

	@BeforeEach
	void setUp() throws Exception {
		name = "SquareName";
	}

	/**
	 * 
	 */
	@Test
	void testGoSquareDefaultConstructor() {
		goSquare = new GoSquare();
		assertNotNull(goSquare);
	}

	@Test
	void testGoSquareConstructorWithArguments() {
		goSquare = new GoSquare(name);
		assertNotNull(goSquare);
	}

	@Test
	void testGetSetSquareName() {
		goSquare = new GoSquare();
		goSquare.setSquareName(name);
		assertEquals(name, goSquare.getSquareName());

	}

}
