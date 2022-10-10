/**
 * 
 */
package multithreading.threads;

/**
 * @author zaki
 *
 */

class Runner extends Thread{
	public void run() {
		
		int i=0;
		while(i<10) {
			System.out.println("Hello "+i);
			i++;
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
		}
	}
}
public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Runner r1 = new Runner();
		
		/**
		 * not multithreading 
		 */
		
		//r1.run(); 
		
		/**
		 *  multithreading 
		 */
		r1.start();
		
		Runner r2 = new Runner();
		r2.start();
		

	}

}
