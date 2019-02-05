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
		//此处创建一个继承了callable<string>的类的对象，作为参数传入线程器服务对象（线程池）的submit方法
		//返回一个Future<String>的Object
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
