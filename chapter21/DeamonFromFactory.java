package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DeamonFromFactory  implements Runnable{
public void run(){
	try {
		while(true) {
			TimeUnit.MILLISECONDS.sleep(100);
			System.out.println(Thread.currentThread()+" "+this);
		}
	}catch(InterruptedException e) {
		System.out.println("Interrupted");
	}
}
public static void main(String[] args) throws InterruptedException {
	ExecutorService exec=Executors.newCachedThreadPool(new DeamonThreadFactory());
	//将一个线程工厂对象传递给Executors.newCachedThreadPool()方法，生产特殊的池线程
	for(int i=0;i<10;i++) {
		exec.execute(new DeamonFromFactory());
		//创建出来的都是辅助线程，main线程结束后没有其他（非辅助）线程，main结束后后台线程都会自动关闭
	}
	System.out.println("All deamon started");
	TimeUnit.MILLISECONDS.sleep(500);
	System.out.println("over");
}
}
