/**
 * 
 */
package game;

/**
 * This represents the Null Square on the board
 * 
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 *
 */
public class NullSquare extends Square {

	/**
	 * Default constructor for a NullSquare
	 */
	public NullSquare() {

	}

	/**
	 * NullSquare constructor with argument
	 * 
	 * @param squareName
	 */
	public NullSquare(String squareName) {
		this.setSquareName(squareName);
	}

	/**
	 * Displays all square information
	 */
	public void displaySquareDetails() {
		super.displaySquareDetails();
	}

}
