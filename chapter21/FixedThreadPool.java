package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class FixedThreadPool {
public static void main(String[] args) {
	ExecutorService exec=Executors.newFixedThreadPool(5);//最大线程数为5的线程池
	for(int i=0;i<5;i++) {
		exec.execute(new LiffOff());
	}
	exec.shutdown();
}
}
