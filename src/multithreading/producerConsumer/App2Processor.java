/**
 * 
 */
package multithreading.producerConsumer;

import java.util.LinkedList;

/**
 * @author zaki
 *
 */
public class App2Processor {

	LinkedList<Integer> queue = new LinkedList<Integer>();
	private int LIMIT =10;
	private Object lock =new Object();
	
	public void producer() {
		int i=0;
		while(true) {
			synchronized (lock) {
				while(queue.size()==LIMIT) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
					}
					
				}
				queue.add(i++);
				lock.notify();
			}
		}
	}
	
	public void consumer() {
	    try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
		}
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				
			}
			synchronized (lock) {
			
			while(queue.size()==0) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					
				}
			}
			int val  =queue.removeFirst();
			int size=queue.size();
			System.out.println("Removed Value = "+val+" Queue size = "+size);
			lock.notify();
		}
	  }
	}
}
