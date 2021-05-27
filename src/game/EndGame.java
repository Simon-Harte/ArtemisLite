package game;

/**
 * 
 * Implements the runnable @interface.
 * 
 * Initialises a thread that counts down from 5 to 0 before setting a
 * volatile/synchronized boolean flag to true.
 * 
 * @author Dan Brown
 *
 */

public class EndGame implements Runnable {

	private volatile boolean flag = false;

	/**
	 * Mutator to set the boolean flag to true
	 */
	public void terminate() {
		this.flag = true;
	}

	/**
	 * @override the run method from the interface Runnable to countdown from '5' to '0'
	 */
	@Override
	public void run() {

		try {

			System.err.println("Ending game in... ");

			for (int count = 5; count >= 0; count--) {
				Thread.sleep(1000);
				System.err.println(count);

				if (count == 0) {
					terminate();
					return;
				}

			}

		} catch (InterruptedException continueGame) {

			System.err.println("Good choice! Let's keep playing...");

		}
	}

	/**
	 * @return the squareName
	 */
	public boolean isFlag() {
		return flag;

	}

}
