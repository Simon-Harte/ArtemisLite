/**
 * 
 */
package game;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 */
class PlayerTest {

	Player player;
	String name;
	int position;
	int balance;
	int squareIndex1, squareIndex2;
	Systems system1, system2;
	DevelopmentSystem devSys;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {

		name = "PlayerName";

		position = 6;
		balance = 500;

		squareIndex1 = 3;
		squareIndex2 = 10;

		system1 = Systems.GATEWAY;
		system2 = Systems.ROCKET;

	}

	/**
	 * Test method for Player default constructor
	 */

	@Test
	void testPlayerDefaultConstructor() {
		player = new Player();
		assertNotNull(player);
	}

	/**
	 * Test method for Player constructor with arguments
	 */
	@Test
	void testPlayerConstructorWithArguments() {
		player = new Player(name, balance, position);
		assertNotNull(player);

	}

	/**
	 * Test method for name setter and getter.
	 */
	@Test
	void testGetSetPlayerName() {
		player = new Player();
		player.setPlayerName(name);
		assertEquals(name, player.getPlayerName());
	}

	/**
	 * Test method for resource balance getter and setter
	 */
	@Test
	void testGetSetResourceBalance() {
		player = new Player();
		player.setResourceBalance(balance);
		assertEquals(balance, player.getResourceBalance());
	}

	/**
	 * Test method for board position getter and setter
	 */
	@Test
	void testGetSetBoardPosition() {
		player = new Player();
		player.setBoardPosition(position);
		assertEquals(position, player.getBoardPosition());
	}

	/**
	 * Test method for adding to a player's owned squares
	 */
	@Test
	void testOwnsAndAddToSquares() {
		player = new Player();
		player.addToSquares(squareIndex1);
		player.addToSquares(squareIndex2);
		assertTrue(player.ownsSquare(squareIndex1) && player.ownsSquare(squareIndex2));
	}

	/**
	 * Test method for player's getOwnedSquares method
	 */
	@Test
	void testGetOwnedSquares() {
		player = new Player();
		player.addToSquares(squareIndex1);
		player.addToSquares(squareIndex2);
		assertTrue(player.getOwnedSquares().contains(Integer.valueOf(squareIndex1))
				&& player.getOwnedSquares().contains(Integer.valueOf(squareIndex2)));
	}

	/**
	 * Test method for Player's owned systems setter and getter
	 */
	@Test
	void testGetAddOwnedSystems() {
		player = new Player();
		player.addOwnedSystem(system1);
		player.addOwnedSystem(system2);
		List<Systems> ownedSystems = player.getOwnedSystems();
		assertTrue(ownedSystems.contains(system1) && ownedSystems.contains(system2));
	}

	/**
	 * Test method for checking if a player owns a system
	 */
	@Test
	void testOwnsSystem() {
		player = new Player();
		player.addToSquares(squareIndex1);
		player.addToSquares(squareIndex2);
		devSys = new DevelopmentSystem();
		devSys.addSquareToSystem(squareIndex1);
		devSys.addSquareToSystem(squareIndex2);
		assertTrue(player.ownsSystem(devSys));
	}

}
