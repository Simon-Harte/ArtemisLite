/**
 * 
 */
package game;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 *
 */
class BoardTest {

	Board board;
	
	
	int playableSquareIndex, nonPlayableIndex;
	
	public static final int MAXIMUM_DEVELOPMENT_STATUS = 5;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		board = new Board();
		
		 
		 playableSquareIndex = 3;
		 
		 nonPlayableIndex = 11;
	}

	/**
	 * Test method for board's default constructor
	 */
	@Test
	void testBoardDefaultConstructor() {
		assertNotNull(board);
	}

	/**
	 * Test method for the square list getter
	 */
	@Test
	void testGetSquares() {
		assertTrue(!board.getSquares().isEmpty());
	}

	

	/**
	 * Test method for the method to return PlayableSquares
	 */
	@Test
	void testGetPlayableSquare() {
		assertEquals(board.getSquares().get(playableSquareIndex), board.getSquare(playableSquareIndex));
		assertTrue(board.getSquare(playableSquareIndex) instanceof PlayableSquare);
		assertThrows(ClassCastException.class, () -> {
			board.getSquare(nonPlayableIndex);
		});
	}

	/**
	 * Test method for board system getters
	 */
	@Test
	void testGetBoardSystems() {
		assertNotNull(board.getBoardSystems());
	}


	/**
	 * Test method for all systems being developed.
	 */
	@Test
	void testAllSystemsDeveloped() {

		for (int loop = 0; loop < board.getSquares().size(); loop++) {
			if (!(board.getSquares().get(loop) instanceof PlayableSquare)) {
				continue;
			} else {
				board.getSquare(loop).setDevelopmentStatus(MAXIMUM_DEVELOPMENT_STATUS);
			}
		}
		
		assertTrue(board.allSystemsDeveloped());
	}

}
