/**
 * Using BlockingQueue
 */
package multithreading.producerConsumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author zaki
 *
 */
public class App1 {

	/**
	 * @param args
	 */
	
	private static BlockingQueue<Integer> queue=new ArrayBlockingQueue<Integer>(10);
	
	public static void main(String[] args){
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					produce();
				} catch (InterruptedException e) {
				}
				
			}
		});
       Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					consume();
				} catch (InterruptedException e) {
				}
				
			}
		});
       
       t1.start();
       t2.start();

	}
	
	public static void produce() throws InterruptedException {
		Random r=new Random();
		while(true) {
			queue.put(r.nextInt(100));
		}
	}
	
	public static void consume() throws InterruptedException {
		while(true) {
			Thread.sleep(500);
			int value =queue.take();
			int size= queue.size();
			System.out.println("Taken Value "+value+" Size of queue "+size);
		}
	}

}
