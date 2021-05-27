package game;

/**
 * This class represents the extended Go Square for the board
 * 
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 *
 */
public class GoSquare extends Square {

	/**
	 * Default constructor for a GoSquare
	 */
	public GoSquare() {

	}

	/**
	 * Constructor for GoSquare with argument
	 * 
	 * @param squareName
	 */
	public GoSquare(String squareName) {
		this.setSquareName(squareName);
	}

	/**
	 * Displays all square information
	 */
	public void displaySquareDetails() {
		super.displaySquareDetails();
	}

}
