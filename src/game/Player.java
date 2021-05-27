/**
 * 
 */
package game;

import java.util.ArrayList;

/**
 * Class to represent players
 * 
 * @author Dan Brown, Chris Forsythe, Simon Harte, Danielle Neill,
 *
 */
public class Player {

	/**
	 * The default resource balance per player
	 */
	public static final int DEFAULT_BALANCE = 500; 

	/**
	 * The name of the player
	 */
	private String playerName;
	/**
	 * the resource balance of the player
	 */
	private int resourceBalance;
	/**
	 * The player's current board position
	 */
	private int boardPosition;
	/**
	 * The player's owned squares
	 */
	private ArrayList<Integer> ownedSquares = new ArrayList<Integer>();
	/**
	 * The player's owned systems
	 */
	private ArrayList<Systems> ownedSystems = new ArrayList<Systems>();

	/**
	 * Default constructor to create player
	 */
	public Player() {
		// default constructor sets default balance
		this.resourceBalance = DEFAULT_BALANCE;
	}

	/**
	 * Constructor with args to create player
	 * 
	 * @param playerName
	 * @param resourceBalance
	 * @param boardPosition
	 */
	public Player(String playerName, int resourceBalance, int boardPosition) {

		this.playerName = playerName;
		this.resourceBalance = resourceBalance;
		this.boardPosition = boardPosition;
	}

	/**
	 * Returns the player name
	 * 
	 * @return String the playerName
	 */
	public String getPlayerName() {
		return playerName;
	}

	/**
	 * Sets the player name
	 * 
	 * @param playerName the playerName to set
	 */
	public void setPlayerName(String name) {
		this.playerName = name;
	}

	/**
	 * Returns the player's resource balance
	 * 
	 * @return the resourceBalance
	 */
	public int getResourceBalance() {
		return resourceBalance;
	}

	/**
	 * Sets the player's resource balance
	 * 
	 * @param resourceBalance the resourceBalance to set
	 */
	public void setResourceBalance(int balance) {
		this.resourceBalance = balance;
	}

	/**
	 * Returns the player's board position
	 * 
	 * @return the boardPosition
	 */
	public int getBoardPosition() {
		return boardPosition;
	}

	/**
	 * Sets the players board position
	 * 
	 * @param boardPosition the boardPosition to set
	 */
	public void setBoardPosition(int boardPosition) {
		this.boardPosition = boardPosition;
	}

	/**
	 * Adds a square index to the player's owned squares
	 * 
	 * @param index
	 */
	public void addToSquares(int index) {
		this.ownedSquares.add(index);
	}

	/**
	 * Takes an integer index and returns true if the player ownes the square,
	 * otherwise returns false
	 * 
	 * @param index
	 * @return boolean
	 */
	public boolean ownsSquare(int index) {

		return ownedSquares.contains(index);

	}

	/**
	 * Returns the list of owned squares
	 * 
	 * @return
	 */
	public ArrayList<Integer> getOwnedSquares() {
		return ownedSquares;
	}

	/**
	 * Returns the list of owned systems
	 * 
	 * @return
	 */
	public ArrayList<Systems> getOwnedSystems() {
		return ownedSystems;
	}

	/**
	 * Adds a Systems reference to the owned systems list
	 * 
	 * @param sysName
	 */
	public void addOwnedSystem(Systems sysName) {
		this.ownedSystems.add(sysName);
	}

	/**
	 * Returns true if the player owns all the squares in a given system, otherwise
	 * returns false
	 * 
	 * @param devSys
	 * @return
	 */
	public boolean ownsSystem(DevelopmentSystem devSys) {
		return this.ownedSquares.containsAll(devSys.getSquaresInSystem());
	}

	/**
	 * Displays all player information
	 */
	public void displayAllStats() {

		System.out.println(this.getPlayerName());
		System.out.println("Squares developed : " + this.getOwnedSquares());
		System.out.println("Systems owned : " + this.getOwnedSystems());
		System.out.println("Remaining balance : " + this.getResourceBalance());
		System.out.println();
	}

}
