package chapter21;

import java.util.concurrent.TimeUnit;

import chapter4.ForEachTest;

class DeamonSpawn implements Runnable{
	public void run() {
while(true)Thread.yield();
}
}
class Deamon implements Runnable{
	private Thread[]threads=new Thread[10];
	public void run() {
		for(int i=0;i<threads.length;i++) {	
			threads[i]=new Thread(new DeamonSpawn());
			threads[i].start();
			System.out.println("DeamonSpawn"+i+"started");}		
		for(int i=0;i<threads.length;i++) {
			System.out.println("threads["+i+"].isdeamon(): "+threads[i].isDaemon());
		}
		}
	
	}

public class Deamons {
public static void main(String[] args) throws InterruptedException {
	Thread thread=new Thread(new Deamon());
	thread.setDaemon(true);
	thread.start();
	System.out.println("thread.isDeamon():"+thread.isDaemon());
	TimeUnit.SECONDS.sleep(1);//必须让主线程有够的运行时间，使得后台时间运行一段时间
	//随着main函数结束，后台线程随之结束
}
}
