/**
 * 
 */
package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 */
class PlayableSquareTest {

	PlayableSquare playSquare;

	String name;

	int cost, fee, developmentStatus;

	double ratio;

	Systems system;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

		name = "SquareName";

		cost = 400;
		fee = 100;
		developmentStatus = 3;
		ratio = 1.5;

		system = Systems.LANDER;
	}

	/**
	 * Test method for PlayableSquare default constructor
	 */
	@Test
	void testPlayableSquareDefaultConstructor() {
		playSquare = new PlayableSquare();
		assertNotNull(playSquare);
	}

	/**
	 * Test method for PlayableSquare constructor with arguments
	 */
	@Test
	void testPlayableSquareConstructorWithArguments() {
		playSquare = new PlayableSquare(name, cost, fee, system);
		assertNotNull(playSquare);
	}

	/**
	 * Test method for square name getter and setter
	 */
	@Test
	void testGetSquareName() {
		playSquare = new PlayableSquare();
		playSquare.setSquareName(name);
		assertEquals(name, playSquare.getSquareName());
	}

	/**
	 * Test method for cost setter and getter
	 */
	@Test
	void testGetSetSquareCost() {
		playSquare = new PlayableSquare();
		playSquare.setSquareCost(cost);
		assertEquals(cost, playSquare.getSquareCost());
	}

	/**
	 * Test method for fee setter and getter
	 */
	@Test
	void testGetSetSquareFee() {
		playSquare = new PlayableSquare();
		playSquare.setSquareFee(fee);
		assertEquals(fee, playSquare.getSquareFee());
	}

	/**
	 * Test method for ratio setter and getter
	 */
	@Test
	void testGetSetRatio() {
		playSquare = new PlayableSquare();
		playSquare.setRatio(ratio);
		assertEquals(ratio, playSquare.getRatio());
	}

	/**
	 * Test method for development status setter and getter
	 */
	@Test
	void testGetSetDevelopmentStatus() {
		playSquare = new PlayableSquare();
		playSquare.setDevelopmentStatus(developmentStatus);
		assertEquals(developmentStatus, playSquare.getDevelopmentStatus());
	}

	/**
	 * Test method for incrementing the square's development status
	 */
	@Test
	void testIncrementDevelopmentStatus() {
		playSquare = new PlayableSquare(name, cost, fee, system);
		playSquare.setRatio(ratio);
		playSquare.setDevelopmentStatus(developmentStatus);
		int expectedCost = (int) Math.floor(cost * ratio);
		int expectedFee = (int) Math.floor(fee * ratio);
		int expectedDevelopmentStatus = developmentStatus + 1;
		playSquare.incrementDevelopmentStatus();
		assertEquals(expectedCost, playSquare.getSquareCost());
		assertEquals(expectedFee, playSquare.getSquareFee());
		assertEquals(expectedDevelopmentStatus, playSquare.getDevelopmentStatus());
	}

	/**
	 * Test method for the development system setter and getter
	 */
	@Test
	void testGetSetSystem() {
		playSquare = new PlayableSquare();
		playSquare.setSystem(system);
		assertEquals(system, playSquare.getSystem());
	}

}
