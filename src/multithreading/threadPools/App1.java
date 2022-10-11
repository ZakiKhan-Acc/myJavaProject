/**
 * 
 */
package multithreading.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author zaki
 *
 */

class Processor implements Runnable{

	private int id;
	
	public Processor(int id) {
		this.id=id;
	}
	
	@Override
	public void run() {
		System.out.println("Starting "+this.id);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("Completed "+this.id);	
	}
	
}

public class App1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Good Day...");
		
		ExecutorService e = Executors.newFixedThreadPool(2);
		
		for(int i=1;i<=5;i++) {
			e.submit(new Processor(i));
		}
		e.shutdown();
		
		System.out.println("All work Submitted...");
		
		try {
			e.awaitTermination(1, TimeUnit.HOURS);
		} catch (InterruptedException e1) {
		}
		
		System.out.println("All work Done....");
		
		

	}

}
