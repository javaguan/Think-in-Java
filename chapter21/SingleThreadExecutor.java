package chapter21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
public static void main(String[] args) {
	ExecutorService ecec=Executors.newSingleThreadExecutor();//每个线程执行完后在执行下一个线程
	for(int i=0;i<5;i++) {
		ecec.execute(new LiffOff());
	}
	ecec.shutdown();	
	
}
}
