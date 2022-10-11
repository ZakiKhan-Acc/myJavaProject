/**
 * 
 */
package multithreading.synchronization;

/**
 * @author zaki
 *
 */
public class Demo2 {

	/**
	 * Make it atomic to make it thread safe
	 */
	private  int count = 0;
	
	public synchronized void increment() {
		count++;
	}
	
	public static void main(String[] args) {
		Demo2 demo =new Demo2();
		demo.doWork();
		

	}

	private void doWork() {
		Thread t1= new Thread(new Runnable() {

			@Override
			public void run() {
			for(int i=0 ;i<10000;i++) {
				//count++;
				increment();
			}
				
			}
		});
		Thread t2= new Thread(new Runnable() {

			@Override
			public void run() {
			for(int i=0 ;i<10000;i++) {
				//count++;
				increment();
			}
				
			}
		});
		t1.start();
		t2.start();
		try {
			t1.join();    //till threads are complete computing
			t2.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println(count);
	}

}
