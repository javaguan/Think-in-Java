package chapter21;

import java.util.concurrent.TimeUnit;

public class aDeamon implements Runnable{
	public void run() {
		try {
			System.out.println("Starting aDeamon");
			TimeUnit.SECONDS.sleep(1);
		}catch (Exception e) {
			System.out.println("Exiting via InterruptedException");
		}finally {System.out.println("finally");}
	}

}
