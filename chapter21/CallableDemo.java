package chapter21;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
public static void main(String[] args) {
	ExecutorService exec=Executors.newCachedThreadPool();
	ArrayList<Future<String>> results=new ArrayList<>();
	for(int i=0;i<10;i++) {
		results.add(exec.submit(new TaskWithResult(i)));
		//�˴�����һ���̳���callable<string>����Ķ�����Ϊ���������߳�����������̳߳أ���submit����
		//����һ��Future<String>��Object
	}
	for(Future<String>future:results) {
	try {
		System.out.println(future.get());
	}catch(InterruptedException e) 
	{
		System.out.println(e);
	return;
	}catch(ExecutionException e) {
		System.out.println(e);
		}finally {exec.shutdown();}
	
	}
}
}
