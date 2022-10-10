/**
 * 
 */
package multithreading.threads;

/**
 * @author zaki
 *
 */
public class App3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
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
		});
		t1.start();

	}

}
