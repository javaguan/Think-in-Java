package chapter21;
import java.util.concurrent.TimeUnit;

public class SimpleDeamons implements Runnable {
public void run() {
	try {
		while(true) {
			TimeUnit.MILLISECONDS.sleep(100);
			System.out.println(Thread.currentThread()+" "+this);
		}
	}catch (InterruptedException e) {
		System.out.println("sleep() interrupted");
	}
	}
public static void main(String[] args) throws InterruptedException {
	for(int i=0;i<10;i++) {
		Thread deamon=new Thread(new SimpleDeamons());
		deamon.setDaemon(true);
		deamon.start();
	}
	System.out.println("all deamon start()");
	TimeUnit.MILLISECONDS.sleep(175);//175��������߳̽��������к�̨�̣߳������̣߳�ֹͣ��������
	System.out.println("haha");
	
}
}
