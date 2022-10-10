package multithreading.threads;

/**
 * @author zaki
 *
 */

class Runner1 implements Runnable{

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
	
}
public class App2 {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runner1());
		Thread t2 = new Thread(new Runner1());
		
		t1.start();
		t2.start();

	}

}
