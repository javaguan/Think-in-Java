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
	//��һ���̹߳������󴫵ݸ�Executors.newCachedThreadPool()��������������ĳ��߳�
	for(int i=0;i<10;i++) {
		exec.execute(new DeamonFromFactory());
		//���������Ķ��Ǹ����̣߳�main�߳̽�����û���������Ǹ������̣߳�main�������̨�̶߳����Զ��ر�
	}
	System.out.println("All deamon started");
	TimeUnit.MILLISECONDS.sleep(500);
	System.out.println("over");
}
}
