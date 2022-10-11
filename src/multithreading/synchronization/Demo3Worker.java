/**
 * 
 */
package multithreading.synchronization;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zaki
 *
 */
public class Demo3Worker {

	/**
	 * Create two locks
	 */
	private Object lock1 =new Object();
	private Object lock2 =new Object();
	
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();
	
	private Random random = new Random();
	
	/**
	 * Intrensic lock is applied on the Demo3Worker object and
	 * there is only one lock, so two independent code is also blocked.
	 */
	
	//public synchronized void stageOne() {
	public void stageOne() {
		synchronized(lock1) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		list1.add(random.nextInt(100));
	    }
	}
	
	//public synchronized void stageTwo() {
	public void stageTwo() {
		synchronized(lock2) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		list2.add(random.nextInt(100));
		}
	}
	
	public void process() {
		for(int i=0;i<1000;i++) {
			stageOne();
			stageTwo();
		}
	}
	
	
	public void main() {
     System.out.println("Start...");
     long start =System.currentTimeMillis();
     //process();
     Thread t1=new Thread(new Runnable() {
		
		@Override
		public void run() {
			process();
			
		}
	 });
     Thread t2=new Thread(new Runnable() {
 		
 		@Override
 		public void run() {
 			process();
 			
 		}
 	 });
     t1.start();
     t2.start();
     try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
	}
     long end =System.currentTimeMillis();
     
     System.out.println(end-start);
     System.out.println("List1 size "+list1.size());
     System.out.println("List2 size "+list2.size());
     
     
	}

}
