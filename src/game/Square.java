/**
 * 
 */
package game;

/**
 * This class represents an abstract square superclass
 * 
 * @author Danielle Neill, Dan Brown, Simon Harte, Chris Forysthe
 *
 */
public abstract class Square {

	/**
	 * The name of this square
	 */
	private String squareName;

	/**
	 * Returns the square name
	 * 
	 * @return the squareName
	 */
	public String getSquareName() {
		return squareName;
	}

	/**
	 * Sets the square name
	 * 
	 * @param squareName the squareName to set
	 */
	public void setSquareName(String squareName) {
		this.squareName = squareName;
	}

	/**
	 * Displays all square information
	 */
	public void displaySquareDetails() {
		System.out.printf("%s\n", getSquareName());
	}

}
