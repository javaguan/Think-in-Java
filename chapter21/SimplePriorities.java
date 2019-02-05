package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable {
private int coundDown=5;
private volatile double d;
private int priority; 
public SimplePriorities(int i) {
	this.priority=i;
}
public String toString() {
	return Thread.currentThread()+": "+"priority"+priority+"counDwon"+coundDown;
}
public void run() {
	Thread.currentThread().setPriority(priority);
	while(true) {
		for(int i=1;i<10000;i++) {
			d+=(Math.PI+Math.E)/(double)i;
			if(i%1000==0)Thread.yield();
		}
		System.out.println(this);
		if(--coundDown==0)return;
	}
}
public static void main(String[] args) {
	ExecutorService exec=Executors.newCachedThreadPool();

		exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
		exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
		//这里优先级最高的最高执行，在我的联想win8中
		exec.shutdown();
	
}
}
