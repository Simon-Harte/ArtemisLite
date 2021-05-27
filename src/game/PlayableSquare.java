/**
 * 
 */
package game;

/**
 * This class represents the playable squares on the ArtemisLite board
 * 
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 *
 */
public class PlayableSquare extends Square {

	/**
	 * The default development level of each square
	 */
	private static final int DEFAULT_DEVELOPMENT_STATUS = 0;
	/**
	 * The default development ratio for each square
	 */
	private static final double DEFAULT_DEVELOPMENT_RATIO = 1.5;

	/**
	 * The cost of the square
	 */
	private int squareCost;
	/**
	 * The fee for landing on the square if another player owns it
	 */
	private int squareFee;
	/**
	 * The ratio for incrementing the cost and fee
	 */
	private double ratio;
	/**
	 * The current development status of the square
	 */
	private int developmentStatus;

	/**
	 * The Systems Enum to which the square belongs
	 */
	private Systems system;

	/**
	 * Default constructor
	 */
	public PlayableSquare() {
	}

	/**
	 * Square constructor with arguments
	 * 
	 * @param squareName the square's name as a String
	 * @param squareCost the square's cost as an int
	 * @param squareFee  the square's fee as an int
	 * @param system     the square's Systems Enum name
	 */
	public PlayableSquare(String squareName, int squareCost, int squareFee, Systems system) {
		super.setSquareName(squareName);

		this.squareCost = squareCost;
		this.squareFee = squareFee;
		this.ratio = DEFAULT_DEVELOPMENT_RATIO;
		this.developmentStatus = DEFAULT_DEVELOPMENT_STATUS;
		this.system = system;
	}

	/**
	 * Returns the square cost
	 * 
	 * @return the squareCost
	 */
	public int getSquareCost() {
		return squareCost;
	}

	/**
	 * Sets the square cost
	 * 
	 * @param squareCost the squareCost to set
	 */
	public void setSquareCost(int squareCost) {
		this.squareCost = squareCost;
	}

	/**
	 * Returns the square fee
	 * 
	 * @return the squareFee
	 */
	public int getSquareFee() {
		return squareFee;
	}

	/**
	 * Sets the square fee
	 * 
	 * @param squareFee the squareFee to set
	 */
	public void setSquareFee(int squareFee) {
		this.squareFee = squareFee;
	}

	/**
	 * Returns the square ratio
	 * 
	 * @return the ratio
	 */
	public double getRatio() {
		return ratio;
	}

	/**
	 * Sets the square ratio
	 * 
	 * @param ratio the ratio to set
	 */
	public void setRatio(double ratio) {
		this.ratio = ratio;
	}

	/**
	 * Returns the square's development status
	 * 
	 * @return the development level
	 */
	public int getDevelopmentStatus() {
		return developmentStatus;
	}

	/**
	 * Sets the square's development status
	 * 
	 * @param status
	 */
	public void setDevelopmentStatus(int status) {
		this.developmentStatus = status;
	}

	/**
	 * Increments the square's development level and increases the cost and fee by
	 * multiplying by the ratio
	 */
	public void incrementDevelopmentStatus() {

		// increment the dev status
		this.developmentStatus++;
		// update the square costs and fees
		this.setSquareCost((int) Math.floor(this.getRatio() * this.getSquareCost()));
		this.setSquareFee((int) Math.floor(this.getRatio() * this.getSquareFee()));

	}

	/**
	 * Shows all square details
	 */
	public void displaySquareDetails() {
		super.displaySquareDetails();
	}

	/**
	 * Returns the Systems Enum name of the square
	 * 
	 * @return system
	 */
	public Systems getSystem() {
		return system;
	}

	/**
	 * Sets the system of the file
	 * 
	 * @param system
	 */
	public void setSystem(Systems system) {

		this.system = system;
	}

}
