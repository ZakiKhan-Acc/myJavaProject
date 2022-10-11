/**
 * use of volatile keyword is explained
 */
package multithreading.synchronization;

import java.util.Scanner;

/**
 * @author zaki
 *
 */

class Processor extends Thread{
	
	/**
	 * caching will not happen
	 * code will run perfectly
	 */
	private volatile boolean run = true;    
	
	public void run() {
		while(run) {
			System.out.println("Running");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void shutdown() {
	       run=false;
	}
	
}
public class Demo1 {

	
	public static void main(String[] args) {
		Processor p1=new Processor();
		p1.start();
	
		
		System.out.println("Press enter/return to stop");
		Scanner sc=new Scanner(System.in);
		sc.nextLine();
		p1.shutdown();
		sc.close();
		

	}

}
