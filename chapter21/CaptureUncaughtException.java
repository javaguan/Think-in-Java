package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
 class ExceptionThread2 implements Runnable {
public void run() {
Thread thread=Thread.currentThread();
System.out.println("run()By"+thread);
System.out.println("eh="+thread.getUncaughtExceptionHandler());

	throw new RuntimeException();
}
}
class MyUncaughtExecptionHanlder implements Thread.UncaughtExceptionHandler{
	public void uncaughtException(Thread t,Throwable e) {
		System.out.println("caught"+e);
	}
	
}
class HandlerThreadFactory implements ThreadFactory{
	public Thread newThread(Runnable r) {
		System.out.println(this+"creating new thread");
		Thread thread=newThread(r);
		System.out.println("created"+thread);
		thread.setUncaughtExceptionHandler(new MyUncaughtExecptionHanlder());
		System.out.println("eh="+thread.getUncaughtExceptionHandler());
		return thread;
	}
}
public class CaptureUncaughtException{
	public static void main(String[] args) {
		ExecutorService exec=Executors.newCachedThreadPool(new HandlerThreadFactory());
		exec.execute(new ExceptionThread2());
	}
}
//ﬂ¿.......∞Ê±æŒ Ã‚∞…
