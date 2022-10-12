/**
 * 
 */
package multithreading.producerConsumer;

/**
 * @author zaki
 *
 */
public class App2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App2Processor p = new App2Processor();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				p.producer();
				
			}
		});
		
        Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				p.consumer();
				
			}
		});
        
        t1.start();
        t2.start();

	}

}
