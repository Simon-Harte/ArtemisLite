/**
 * 
 */
package game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class to represent ArtemisLite game board
 * 
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill
 *
 */
public class Board {

	/**
	 * The list of square objects belonging to the board
	 */
	private List<Square> boardSquares = new ArrayList<Square>();
	/**
	 * The list of system objects belonging to the board
	 */
	private List<DevelopmentSystem> boardSystems = new ArrayList<DevelopmentSystem>();

	/**
	 * Default constructor to create board
	 */
	public Board() {
		// default constructor populates the board and systems
		this.populateBoard();
		this.populateSystems();
	}

	/**
	 * Returns the list of squares belonging to the board
	 * 
	 * @return square list as List<>
	 */
	public List<Square> getSquares() {
		return boardSquares;
	}

	/**
	 * This method populates the board with the squares
	 */
	private void populateBoard() {

		GoSquare goSquare = new GoSquare("GO");
		NullSquare nullSquare = new NullSquare("Black Hole");
		PlayableSquare ps1 = new PlayableSquare("Life Support Unit", 200, 50, Systems.SUITS);  
		PlayableSquare ps2 = new PlayableSquare("Environmental Shielding", 200, 50, Systems.SUITS);
		PlayableSquare ps3 = new PlayableSquare("Secure Development Companies", 400, 100, Systems.LANDER);
		PlayableSquare ps4 = new PlayableSquare("Research Science Experiments", 400, 100, Systems.LANDER);
		PlayableSquare ps5 = new PlayableSquare("Lander Construction", 400, 100, Systems.LANDER);
		PlayableSquare ps6 = new PlayableSquare("Rocket Engine", 600, 150, Systems.ROCKET);
		PlayableSquare ps7 = new PlayableSquare("Launch Pad", 600, 150, Systems.ROCKET);
		PlayableSquare ps8 = new PlayableSquare("Capsule", 600, 150, Systems.ROCKET);
		PlayableSquare ps9 = new PlayableSquare("PPR", 800, 200, Systems.GATEWAY);
		PlayableSquare ps10 = new PlayableSquare("Halo", 800, 200, Systems.GATEWAY);

		// using solid implementation from JCF to throw these all in at the right index
		// (to match game board)...
		Collections.addAll(boardSquares, goSquare, ps1, ps2, ps3, ps4, ps5, ps6, ps7, ps8, ps9, ps10, nullSquare);

	}

	/**
	 * This method populates the systems based on the entered squares
	 */
	private void populateSystems() {

		// iterate through the squares
		for (int loop = 0; loop < this.boardSquares.size(); loop++) {
			// skip non-playable squares
			if (!(this.boardSquares.get(loop) instanceof PlayableSquare)) {
				continue;
			} else {
				// get the system
				Systems name = ((PlayableSquare) this.boardSquares.get(loop)).getSystem();
				// if the system doesnt exist
				if (!systemExists(name)) {
					// create it and add the square
					DevelopmentSystem devSys = new DevelopmentSystem(name);
					devSys.addSquareToSystem(loop);
					this.addSystem(devSys);
				} else {
					// otherwise add the square to the system it belongs to
					this.getBoardSystems().get(indexOfSystem(name)).addSquareToSystem(loop);
				}

			}

		}
	}

	/**
	 * This returns true if a system exists and false if a system doesn't exist
	 * 
	 * @param sysName the Enum value of the system
	 * @return the boolean result
	 */

	private boolean systemExists(Systems sysName) {
		boolean sysExists = false;
		if (this.getBoardSystems().size() == 0) {
			sysExists = false;
		} else {
			for (DevelopmentSystem devSys : this.getBoardSystems()) {
				if (devSys.getSystemName() == sysName) {
					sysExists = true;
				}
			}
		}
		return sysExists;
	}

	/**
	 * This returns the int of an existing system to act upon it
	 * 
	 * @param name the Enum name value of the system
	 * @return the int index
	 */
	private int indexOfSystem(Systems name) {
		int index = 0;

		for (int loop = 0; loop < this.getBoardSystems().size(); loop++) {
			if (this.getBoardSystems().get(loop).getSystemName() == name) {
				index = loop;
				break;
			}
		}

		return index;
	}

	/**
	 * This method is called when a playable square's attributes are required
	 * 
	 * @param index the index of the square
	 * @return the square
	 * @throws ClassCastException thrown if called on a non-PlayableSquare
	 */
	public PlayableSquare getSquare(int index) throws ClassCastException {
		// the mother of all casts, lord forgive me
		return (PlayableSquare) this.boardSquares.get(index);

	}

	/**
	 * Returns the board's systems
	 * 
	 * @return board's systems as a List<>
	 */
	public List<DevelopmentSystem> getBoardSystems() {
		return boardSystems;
	}

	/**
	 * Adds a DevelopmentSystem to the list of systems
	 * 
	 * @param devSys
	 */
	public void addSystem(DevelopmentSystem devSys) {
		this.boardSystems.add(devSys);
	}

	/**
	 * Checks development status of squares in system using a boolean flag
	 * 
	 * @return boolean fullyDeveloped
	 */
	public boolean allSystemsDeveloped() {

		boolean fullyDeveloped = true;

		for (int loop = 0; loop < this.getSquares().size(); loop++) {

			if (!(this.getSquares().get(loop) instanceof PlayableSquare)) {
				continue;

			} else if (this.getSquare(loop).getDevelopmentStatus() < Game.MAXIMUM_SQUARE_DEVELOPMENT) {
				fullyDeveloped = false;

			}

		}

		return fullyDeveloped;
	}

}
