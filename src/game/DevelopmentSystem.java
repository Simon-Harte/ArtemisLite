/**
 * 
 */
package game;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents our DevelopmentSystems on the Board
 * 
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 *
 */
public class DevelopmentSystem {

	/**
	 * The Systems Enum name value of the system
	 */
	private Systems systemName;
	/**
	 * The system's associated square indices
	 */
	private List<Integer> squaresInSystem = new ArrayList<Integer>();
	/**
	 * The ownership status of the system
	 */
	private boolean isOwned;

	/**
	 * Default constructor
	 */
	public DevelopmentSystem() {
		// defaults to unowned at first
		this.setOwned(false);
	}

	/**
	 * Constructor for DevelopmentSystem with args
	 * 
	 * @param name
	 */
	public DevelopmentSystem(Systems name) {
		this.systemName = name;

	}

	/**
	 * Returns the development system's name as a Systems Enum value
	 * 
	 * @return the development system's name as a Systems Enum value
	 */
	public Systems getSystemName() {
		return systemName;
	}

	/**
	 * Sets the development system's name
	 * 
	 * @param name as a Systems Enum value
	 */
	public void setSystemName(Systems name) {
		this.systemName = name;
	}

	/**
	 * Returns the list of squares within system
	 * 
	 * @return list of squares as an ArrayList<>
	 */
	public List<Integer> getSquaresInSystem() {
		return squaresInSystem;
	}

	/**
	 * Returns the system's ownership status
	 * 
	 * @return the ownership status as a boolean
	 */
	public boolean isOwned() {
		return isOwned;
	}

	/**
	 * Sets the system's ownership status
	 * 
	 * @param isOwned the ownership status as a boolean
	 */
	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}

	/**
	 * Adds an associated square's index to the system's square list
	 * 
	 * @param index
	 */
	public void addSquareToSystem(int index) {
		this.squaresInSystem.add(index);
	}

}
